package sample;

public abstract class Monster {

    private final String name;

    public Monster(String name) {
        this.name = name;
    }

    public String methodToBeOverwritten() {
        return "Monster: ";
    }

    @Override
    public String toString() {
        return methodToBeOverwritten() + name;
    }
}
