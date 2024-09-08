package gis.behavioral.state;

public class RunState extends State {

    public RunState(Player player) {
        super(player);
    }


    @Override
    public void stop() {
        player.setSpeed(0);
        player.setState(new StopState(player));
        player.talk("멈춘다");
    }


    @Override
    public void run() {
        System.out.println("뛰어");
    }


    @Override
    public void walk() {
        player.setSpeed(5);
        player.setState(new WalkState(player));
        System.out.println("걷기 시작");
    }


    @Override
    public String getDescription() {
        return "뛰고 있음";
    }
}
