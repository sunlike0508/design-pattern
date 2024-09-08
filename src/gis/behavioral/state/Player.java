package gis.behavioral.state;

public class Player {

    private int speed;
    private State state = new StopState(this);


    public State getState() {
        return state;
    }


    public void setState(State state) {
        this.state = state;
    }


    public int getSpeed() {
        return speed;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void talk(String msg) {
        System.out.println("플레이어 : " + msg);
    }
}
