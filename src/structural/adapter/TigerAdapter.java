package structural.adapter;

public class TigerAdapter extends Animal{

    private final Tiger tiger;

    public TigerAdapter(String name) {
        super(name);

        tiger= new Tiger();
        tiger.setName(name);
    }

    @Override
    public void sound() {
        tiger.sound();
    }
}
