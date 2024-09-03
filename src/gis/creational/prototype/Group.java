package gis.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Group implements Shape, Prototype {

    private final List<Shape> shapeList = new ArrayList<>();

    private final String name;


    public Group(String name) {
        this.name = name;
    }


    Group addShape(Shape shape) {
        shapeList.add(shape);
        return this;
    }


    @Override
    public Object copy() {
        Group newGroup = new Group(name);

        shapeList.forEach(shape -> newGroup.shapeList.add((Shape) ((Prototype) shape).copy()));

        return newGroup;
    }


    @Override
    public String draw() {
        StringBuffer result = new StringBuffer(name);
        result.append("(");

        shapeList.forEach(shape -> result.append(shape.draw()).append(" "));

        result.delete(result.toString().length() - 1, result.toString().length()).append(")");
        return result.toString();
    }


    @Override
    public void moveOffSet(int dx, int dy) {
        shapeList.forEach(shape -> shape.moveOffSet(dx, dy));
    }
}
