package gis.creational.builder.way1;

/**
 * 복잡 한 구성의 객체를 효과적으로 생성하는 패턴
 * <p></p>
 * 1) 생성시 지정해야 할 인자가 많을 때 사용하는 패턴<p></p>
 * 2) 객체 생성시 여러 단계를 순차적으로 거칠 때, 이 단계의 순서를 결정해 두고 각 단계를 다양하게 구현할수 있도록 하는 패턴
 */
public class Car {

    private final String name;
    private final boolean hasAircon;
    private final int engines;


    public Car(String name, boolean hasAircon, int engines) {
        this.name = name;
        this.hasAircon = hasAircon;
        this.engines = engines;
    }


    public String getName() {
        return name;
    }


    public boolean isHasAircon() {
        return hasAircon;
    }


    public int getEngines() {
        return engines;
    }


    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", hasAircon=" + hasAircon + ", engines=" + engines + '}';
    }
}
