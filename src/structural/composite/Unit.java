package structural.composite;

public abstract class Unit {
    private String name;


    protected Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "(" + getSize() + ")";
    }

    public abstract int getSize();
}
