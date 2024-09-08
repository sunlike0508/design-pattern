package gis.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {
        //ComponentFactory factory = new WindowFactory();
        ComponentFactory factory = new LinuxFactory();

        Button button = factory.createButton("확인");

        button.render();

    }
}
