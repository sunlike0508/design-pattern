package gis.structural.facade;

public class Main {

    public static void main(String[] args) {

        Facade facade = new Facade();

        String name = "Shin";

        facade.run(name);

        facade.run(name);

        facade.run("Kim");

        facade.run("Kim");

        facade.run("tim");
    }
}
