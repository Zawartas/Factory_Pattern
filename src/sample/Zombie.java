package sample;

public class Zombie extends Monster {

    public Zombie(String name) {
        super(name);
    }

    @Override
    public String methodToBeOverwritten() {
        return super.methodToBeOverwritten() + "Zombie ";
    }
}
