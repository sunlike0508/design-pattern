package gis.behavioral.vistor;

import java.util.ArrayList;
import java.util.List;

public class ItemList implements Unit {

    private final List<Unit> unitList = new ArrayList<>();


    public void add(Unit unit) {
        unitList.add(unit);
    }


    public List<Unit> getUnitList() {
        return unitList;
    }


    @Override
    public void accept(Visitor visitor) {
        unitList.forEach(visitor::visit);
    }
}
