package gis.creational.prototype;

public class Main {

    public static void main(String[] args) {
        Point pt1 = new Point();
        pt1.setX(0).setY(0);
        System.out.println(pt1.draw());

        Point pt2 = new Point();
        pt2.setX(100).setY(0);
        System.out.println(pt2.draw());

        Line line1 = new Line();
        line1.setStartPt(pt1).setEndPt(pt2);
        System.out.println(line1.draw());

        Point pt3 = new Point();
        pt3.setX(100).setY(100);

        Point pt4 = new Point();
        pt4.setX(0).setY(100);

        Line line2 = new Line();
        line2.setStartPt(pt2).setEndPt(pt3);

        Line line3 = new Line();
        line3.setStartPt(pt3).setEndPt(pt4);

        Line line4 = new Line();
        line4.setStartPt(pt4).setEndPt(pt1);

        Group group = new Group("사각형");
        group.addShape(line1).addShape(line2).addShape(line3).addShape(line4);
        System.out.println(group.draw());

        Group cloneGroup = (Group) group.copy();
        cloneGroup.moveOffSet(100, 100);

        System.out.println(cloneGroup.draw());
        System.out.println(group.draw());

    }
}
