package gis.creational.builder.way2.way1;


public class Director {

    private final Builder builder;


    public Director(Builder builder) {
        this.builder = builder;
    }


    public String build() {
        return builder.head() + builder.body() + builder.footer();
    }
}
