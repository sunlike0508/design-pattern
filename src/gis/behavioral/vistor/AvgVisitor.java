package gis.behavioral.vistor;

public class AvgVisitor implements Visitor {

    private int count;
    private int sum;


    public double getValue() {
        return (double) sum / count;
    }


    @Override
    public void visit(Unit unit) {
        if(unit instanceof Item) {
            sum += ((Item) unit).getValue();
            count++;
        } else {
            unit.accept(this);
        }
    }
}
