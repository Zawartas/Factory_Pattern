package sample;

public class UndeadDog extends Monster {

    public UndeadDog(String name) {
        super(name);
    }

    @Override
    public String methodToBeOverwritten() {
        return super.methodToBeOverwritten() + "UndeadSoldier ";
    }
}
