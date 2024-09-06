package gis.creational.builder.way2.way1;

public class IntroduceTextBuilder extends Builder {

    public IntroduceTextBuilder(Data data) {
        super(data);
    }


    @Override
    public String head() {
        return "Introduce Text\n";
    }


    @Override
    public String body() {
        return "My name is " + data.getName() + " and my age is " + data.getAge() + "\n";
    }


    @Override
    public String footer() {
        return "Introduce Footer";
    }
}
