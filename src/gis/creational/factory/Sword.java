package gis.creational.factory;

public class Sword implements Item {

    @Override
    public void use() {
        System.out.println("검으로 공격");
    }
}
