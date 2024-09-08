package gis.behavioral.state;

public class StopState extends State {

    public StopState(Player player) {
        super(player);
    }


    @Override
    public void stop() {
        System.out.println("멈춰");
    }


    @Override
    public void run() {
        player.setSpeed(10);
        player.setState(new RunState(player));
        player.talk("뛰기 시작");
    }


    @Override
    public void walk() {
        player.setSpeed(5);
        player.setState(new RunState(player));
        player.talk("걷기 시작");
    }


    @Override
    public String getDescription() {
        return "멈춰 있음";
    }
}
