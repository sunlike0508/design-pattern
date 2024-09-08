package gis.behavioral.command;

public class MoveCommand implements Command {

    private final int x;
    private final int y;


    public MoveCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public void run() {
        System.out.println("Moving " + x + " to " + y);
    }
}
