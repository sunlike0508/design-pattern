package gis.behavioral.vistor;

public class Item implements Unit {

    private final int value;


    public Item(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
