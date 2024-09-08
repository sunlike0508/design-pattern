package gis.behavioral.command;


import java.util.ArrayList;
import java.util.List;

/**
 * 여러커맨드를 가지고 있음 <p></p>
 * 배치 기능
 */
public class CommandGroup implements Command {

    private final List<Command> commandList = new ArrayList<>();


    public void add(Command command) {
        commandList.add(command);
    }


    @Override
    public void run() {

        for(Command command : commandList) {
            command.run();
        }
    }
}
