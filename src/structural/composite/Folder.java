package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Unit{

    private List<Unit> unitList = new ArrayList<>();


    public Folder(String name) {
        super(name);
    }


    @Override
    public int getSize() {
        int size = 0;

        for(Unit unit : unitList) {
            size += unit.getSize();
        }

        return size;
    }

    public boolean add(Unit unit) {
        unitList.add(unit);
        return true;
    }

    public void list() {
        list("", this);
    }


    private void list(String indent, Unit unit) {
        if(unit instanceof  File) {
            System.out.println(indent + unit);
        } else {
            Folder dir = (Folder) unit;
            System.out.println(indent + "+ " + unit);
            dir.unitList.forEach(u -> list(indent + "    ", u));
        }
    }
}
