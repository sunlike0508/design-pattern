package gis.behavioral.strategy;

public class SumPrinter {

    public void print(SumStrategy strategy, int N) {
        System.out.printf("The sum of 1 - %d : ", N);
        System.out.println(strategy.get(N));
    }
}
