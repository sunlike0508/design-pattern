package gis.creational.prototype;

public class Line implements Shape, Prototype {

    private Point startPt;
    private Point endPt;


    public Point getStartPt() {
        return startPt;
    }


    public Line setStartPt(Point startPt) {
        this.startPt = startPt;
        return this;
    }


    public Point getEndPt() {
        return endPt;
    }


    public Line setEndPt(Point endPt) {
        this.endPt = endPt;
        return this;
    }


    @Override
    public Object copy() {
        Line newLine = new Line();

        newLine.startPt = (Point) startPt.copy();
        newLine.endPt = (Point) endPt.copy();

        return newLine;
    }


    @Override
    public String draw() {
        return "LINE(" + startPt.draw() + "," + endPt.draw() + ")";
    }


    @Override
    public void moveOffSet(int dx, int dy) {
        startPt.moveOffSet(dx, dy);
        endPt.moveOffSet(dx, dy);
    }
}
