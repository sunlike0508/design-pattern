package gis.behavioral.observer;

public class NBettingPlayer extends Player {

    private final int winNumber;


    public NBettingPlayer(String name, int winNumber) {
        super(name);
        this.winNumber = winNumber;
    }


    @Override
    public void update(int diceNumber) {
        if(diceNumber == winNumber) {
            System.out.println(getName() + "님이 이김");
        }
    }
}
