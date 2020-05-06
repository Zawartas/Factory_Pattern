package sample;

public abstract class Zombie {
    private final String name;

    public Zombie(String name) {
        this.name = name;
    }

    public String methodToBeOverwritten() {
        return "Zombie ";
    }

    @Override
    public String toString() {
        return describe() + name;
    }
}
