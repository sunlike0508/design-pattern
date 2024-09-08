package gis.behavioral.state;

public class WalkState extends State {

    public WalkState(Player player) {super(player);}


    @Override
    public void stop() {
        player.setSpeed(0);
        player.setState(new StopState(player));
        player.talk("멈춘다");
    }


    @Override
    public void run() {
        player.setSpeed(10);
        player.setState(new RunState(player));
        player.talk("뛰기 시작");
    }


    @Override
    public void walk() {
        System.out.println("걸어");
    }


    @Override
    public String getDescription() {
        return "걷고 있음";
    }
}
