package gis.behavioral.command;

public class PrintCommand implements Command {

    private final String content;


    public PrintCommand(String content) {
        this.content = content;
    }


    @Override
    public void run() {
        System.out.println(content);
    }
}
