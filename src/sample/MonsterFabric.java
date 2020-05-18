package sample;

import javafx.scene.control.TextArea;

import java.util.Arrays;
import java.util.HashMap;

import java.util.function.Supplier;

public class MonsterFabric {

    // This is the map of TYPE and MonsterMaker interface,
    // which has ONE method make. That method returns Monster Instance.
    // Depending on TYPE, that method returns different Instances of Monster.
    private final static HashMap<String, MonsterMaker> mapOfMonstersToMake = new HashMap<>() {
                {
                    put("Zombie", (name) -> new Zombie(name));
                    put("UndeadSoldier", (name) -> new UndeadSoldier(name));
                    put("UndeadDog", new MonsterMaker() {
                        @Override
                        public Monster make(String name) {
                            return new UndeadDog(name);
                        }
                    });
                }
            };

    public static Monster make(String type, String name, TextArea ta) {
        ta.appendText(String.format("Monster of type: %s and name: %s has been CREATED\n", type, name));
        return mapOfMonstersToMake.get(type).make(name);
    }

    public static Monster make(String type) {
        if (type.equals("Zombie"))
            return new Zombie("Aaa");
        return null;
    }

    public static String[] keys() {
        String[] srt = new String[mapOfMonstersToMake.size()];
        mapOfMonstersToMake.keySet().toArray(srt);
        Arrays.sort(srt);
        return srt;
    }
}
