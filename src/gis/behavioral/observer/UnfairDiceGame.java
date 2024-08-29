package gis.behavioral.observer;

import java.util.Random;

public class UnfairDiceGame extends DiceGame {


    private final Random random = new Random();


    @Override
    public void play() {
        int randomNumber = random.nextInt(100);
        int diceNumber;

        if(randomNumber < 3) { // 3
            diceNumber = 1;
        } else if(randomNumber < 10) { // 7
            diceNumber = 2;
        } else if(randomNumber < 20) { // 10
            diceNumber = 3;
        } else if(randomNumber < 80) { // 60
            diceNumber = 4;
        } else if(randomNumber < 95) { // 15
            diceNumber = 5;
        } else {                        // 5
            diceNumber = 6;
        }

        System.out.println("주사위 던짐 : " + diceNumber);

        playerList.forEach(player -> player.update(diceNumber));
    }
}
