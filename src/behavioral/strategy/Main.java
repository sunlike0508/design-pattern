package behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        SumPrinter sumPrinter = new SumPrinter();

        sumPrinter.print(new SimpleSumStrategy(), 10);
        sumPrinter.print(new GaussSumStrategy(), 10);
    }
}
