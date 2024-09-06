package gis.creational.builder.way1;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("car1", false, 2);


        System.out.println(car1);


        Car car2 = new CarBuilder().name("car2").hasAircon(true).engines(4).build();

        System.out.println(car2.toString());
    }
}
