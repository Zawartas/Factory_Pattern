package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ComboBox cbWithInstantiatedObj;
    @FXML
    private ComboBox<String> cbWithTypes;
    @FXML
    private TextArea ta;
    @FXML
    private TextField tf;

    @FXML
    public void initialize() {
        for(String type : MonsterFabric.keys()) {
            // We cycle through all keys from MonsterFabric keys.
            // Then we call the method make from the MonsterMaker interface.
            // All instances will have the same name "SomeGivenName".
            // This already instantiates all classes and populates our ComboBox
            cbWithInstantiatedObj.getItems().add(MonsterFabric.make(type, "SomeGivenName", ta));
            cbWithTypes.getItems().add(type);
        }
        cbWithInstantiatedObj.getSelectionModel().selectFirst();
        cbWithInstantiatedObj.getSelectionModel().select(1);
    }

//    Zombie zb = (Zombie) MonsterFabric.make("Zombie");
//    Monster mz = MonsterFabric.make("Zombie");

    @FXML
    public void btnClicked() {
        String type = cbWithTypes.getSelectionModel().getSelectedItem();
        String name = tf.getText();
        MonsterFabric.make(type, name, ta);
    }
}
