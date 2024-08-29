package gis.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class DiceGame {

    protected List<Player> playerList = new ArrayList<>();


    public void addPlayer(Player player) {
        playerList.add(player);
    }


    public abstract void play();
}
