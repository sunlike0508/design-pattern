package structural.adapter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog("댕이1"));
        animals.add(new Dog("댕이2"));
        animals.add(new Cat("냥이"));
        //animals.add(new Tiger("호랭이"));
        animals.add(new TigerAdapter("호랭이"));

        animals.forEach(Animal::sound);
    }
}
