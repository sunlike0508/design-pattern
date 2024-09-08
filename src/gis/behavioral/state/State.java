package gis.behavioral.state;

public abstract class State {

    protected Player player;


    public State(Player player) {
        this.player = player;
    }


    public abstract void stop();

    public abstract void run();

    public abstract void walk();

    public abstract String getDescription();
}
