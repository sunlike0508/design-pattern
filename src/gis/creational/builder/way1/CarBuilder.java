package gis.creational.builder.way1;


public class CarBuilder {

    private boolean hasAircon;
    private int engines;
    private String name;


    public CarBuilder name(String name) {
        this.name = name;
        return this;
    }


    public CarBuilder hasAircon(boolean hasAircon) {
        this.hasAircon = hasAircon;
        return this;
    }


    public CarBuilder engines(int engines) {
        this.engines = engines;
        return this;
    }


    public Car build() {
        return new Car(name, hasAircon, engines);
    }
}
