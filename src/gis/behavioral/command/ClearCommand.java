package gis.behavioral.command;

public class ClearCommand implements Command {

    @Override
    public void run() {
        System.out.println("Cleared");
        System.out.flush();
    }
}
