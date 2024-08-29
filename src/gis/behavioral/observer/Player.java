package gis.behavioral.observer;


public abstract class Player {

    private final String name;


    public Player(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public abstract void update(int diceNumber);
}
