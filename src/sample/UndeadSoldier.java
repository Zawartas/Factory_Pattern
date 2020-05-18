package sample;

public class UndeadSoldier extends Monster {

    public UndeadSoldier(String name) {
        super(name);
    }

    @Override
    public String methodToBeOverwritten() {
        return super.methodToBeOverwritten() + "UndeadSoldier ";
    }

}
