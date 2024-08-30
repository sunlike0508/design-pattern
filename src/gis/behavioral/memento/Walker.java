package gis.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>객체의 상태를 기억해 두었다가 필요할 때 기억해둔 상태로 객체를 되돌린다.</p>
 * <p>객체의 상태에 대한 기억은 다른 객체에서도 읽기 전용으로 접근할 수 있다.</p>
 * <p>객체의 상태에 대한 기억에 대한 생성은 오직 해당 객체만 할 수 있다.</p>
 */

public class Walker {

    private final int targetX;
    private final int targetY;
    private final List<String> actionList = new ArrayList<>();
    private int currentX;
    private int currentY;


    public Walker(int currentX, int currentY, int targetX, int targetY) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.targetX = targetX;
        this.targetY = targetY;
    }


    public void nowDistance() {
        System.out.println(
                "Now Distance : " + Math.sqrt(Math.pow(currentX - targetX, 2) + Math.pow(currentY - targetY, 2)));
    }


    public double walk(String action) {
        actionList.add(action);

        switch(action) {
            case "UP" -> currentY += 1;
            case "RIGHT" -> currentX += 1;
            case "DOWN" -> currentY -= 1;
            default -> currentX -= 1;
        }

        return Math.sqrt(Math.pow(currentX - targetX, 2) + Math.pow(currentY - targetY, 2));
    }


    public Memento createMemento() {
        Memento memento = new Memento();

        memento.x = this.currentX;
        memento.y = this.currentY;
        memento.actionList = List.copyOf(this.actionList);

        return memento;
    }


    public void restoreMemento(Memento memento) {
        this.currentX = memento.x;
        this.currentY = memento.y;
        memento.actionList = List.copyOf(memento.actionList);
    }


    @Override
    public String toString() {
        return actionList.toString();
    }


    public class Memento {

        private int x, y;
        private List<String> actionList;


        private Memento() {

        }
    }
}
