package structural.adapter;

public class Tiger {

    private String name;

    void setName(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println(name + " growl");
    }

}
