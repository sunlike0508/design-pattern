package gis.behavioral.observer;

public class EvenBettingPlayer extends Player {

    public EvenBettingPlayer(String name) {
        super(name);
    }


    @Override
    public void update(int diceNumber) {
        if(diceNumber % 2 == 0) {
            System.out.println(getName() + "가 이김");
        }
    }
}
