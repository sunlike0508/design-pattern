package gis.behavioral.command;

public class Main {

    public static void main(String[] args) {
        Command clear = new ClearCommand();
        clear.run();

        Command move = new MoveCommand(1, 2);
        move.run();

        Command print = new PrintCommand("hi");
        print.run();

        CommandGroup group = new CommandGroup();
        group.add(clear);
        group.add(move);
        group.add(print);

        group.run();
    }
}