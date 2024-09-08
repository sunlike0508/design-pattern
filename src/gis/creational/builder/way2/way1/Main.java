package gis.creational.builder.way2.way1;

public class Main {

    public static void main(String[] args) {
        Data data = new Data("shin", 30);

        Builder plain = new PlainTextBuilder(data);
        Director plainDirector = new Director(plain);
        System.out.println(plainDirector.build());
        System.out.println();

        Builder introduce = new IntroduceTextBuilder(data);
        Director introduceDirector = new Director(introduce);
        System.out.println(introduceDirector.build());
    }
}
