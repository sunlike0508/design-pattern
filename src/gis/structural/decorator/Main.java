package gis.structural.decorator;

public class Main {

    public static void main(String[] args) {
        Strings strings = new Strings();
        strings.add("hello~");
        strings.add("My name is seonho");
        strings.add("How are you?");
        strings.add("I am fine. Thank you. and you!!");

        Item decorator = new SideDecorator(strings, '\"');
        decorator.print();

        decorator = new BoxDecorator(strings, '\"');

        decorator.print();
    }
}
