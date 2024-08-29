package gis.structural.flyweight.after;

public class Main {

    /**
     * 어떤 객체를 사용하기 위해 매번 생성하지 않고 한번만 생성하고 다시 필요해 질때는 이전에 생성된 객체를 재사용할 수 있음
     * 객체를 생성할 때 많은 자원을 소모될 경우 플라이웨이트 패턴을 적용하여 훨씬 적은 자원만으로 필요한 객체를 재사용할 수 있음
     */

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "while", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "while", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('l', "while", fontFactory.getFont("nanum:12"));
        Character c4 = new Character('l', "while", fontFactory.getFont("nanum:12"));
        Character c5 = new Character('o', "while", fontFactory.getFont("nanum:12"));

        //        Character c1 = new Character('h', "while", FontFactory.createFont("nanum:12"));
        //        Character c2 = new Character('e', "while", FontFactory.createFont("nanum:12"));
        //        Character c3 = new Character('l', "while", FontFactory.createFont("nanum:12"));
        //        Character c4 = new Character('l', "while", FontFactory.createFont("nanum:12"));
        //        Character c5 = new Character('o', "while", FontFactory.createFont("nanum:12"));
    }
}
