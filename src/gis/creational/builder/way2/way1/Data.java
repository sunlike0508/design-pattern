package gis.creational.builder.way2.way1;


public class Data {

    private final String name;
    private final int age;


    public Data(String name, int age) {
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }
}
