package behavioral.strategy;

public class SimpleSumStrategy implements SumStrategy{

    @Override
    public int get(int N) {

        int sum = N;

        for(int i = 1 ; i < N ; i++) {
            sum += i;
        }


        return sum;
    }
}
