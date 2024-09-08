package gis.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class CommandListExpression implements Expression {

    private final List<CommandExpression> commands = new ArrayList<>();


    @Override
    public boolean parse(Context context) {

        while(true) {
            String currentKeyword = context.getCurrentKeyword();

            if(currentKeyword == null) {
                return false;
            } else if(currentKeyword.equals("END")) {
                context.readNextKeyword();
                break;
            } else {
                CommandExpression command = null;

                if(LoopCommandExpression.checkValidKeyword(currentKeyword)) {
                    command = new LoopCommandExpression(currentKeyword);
                } else if(ActionCommandExpression.checkValidKeyword(currentKeyword)) {
                    command = new ActionCommandExpression(currentKeyword);
                }

                if(command != null) {
                    if(command.parse(context)) {
                        commands.add(command);
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return true;
    }


    @Override
    public boolean run() {
        for(CommandExpression command : commands) {
            if(!command.run()) {
                return false;
            }
        }

        return true;
    }


    @Override
    public String toString() {
        return commands.toString();
    }
}
