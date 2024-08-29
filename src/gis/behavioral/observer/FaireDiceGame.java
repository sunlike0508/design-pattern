package gis.behavioral.observer;

import java.util.Random;

public class FaireDiceGame extends DiceGame {

    private final Random random = new Random();


    @Override
    public void play() {
        int diceNumber = random.nextInt(6) + 1;
        System.out.println("주사위 던짐 : " + diceNumber);

        playerList.forEach(player -> player.update(diceNumber));
    }
}
