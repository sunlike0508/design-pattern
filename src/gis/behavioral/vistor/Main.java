package gis.behavioral.vistor;

/**
 * 데이터 구조와 데이터 처리를 분리해주는 패턴 <p>
 * 데이터 처리 방식을 기존의 소스 코드 변경 없이 새로운 클래스 추가만으로 확장할 수 있음 <p>
 * 데이터 구조는 composite pattern을 사용해 표현함
 */
public class Main {

    public static void main(String[] args) {
        ItemList list = new ItemList();
        list.add(new Item(10));
        list.add(new Item(20));
        list.add(new Item(40));

        ItemList list2 = new ItemList();
        list2.add(new Item(30));
        list2.add(new Item(40));
        list.add(list2);

        ItemList list3 = new ItemList();
        list3.add(new Item(25));
        list2.add(list3);

        SumVisitor sumVisitor = new SumVisitor();
        list.accept(sumVisitor);
        System.out.println(sumVisitor.getValue());


        AvgVisitor avgVisitor = new AvgVisitor();
        list.accept(avgVisitor);
        System.out.println(avgVisitor.getValue());
    }
}
