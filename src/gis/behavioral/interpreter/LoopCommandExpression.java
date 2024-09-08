package gis.behavioral.interpreter;

public class LoopCommandExpression extends CommandExpression {

    int count;
    private CommandListExpression expression;


    public LoopCommandExpression(String keyword) {
        super(keyword);
    }


    public static boolean checkValidKeyword(String currentKeyword) {
        return currentKeyword.equals("LOOP");
    }


    @Override
    public boolean parse(Context context) {
        if(!checkValidKeyword(keyword)) {
            return false;
        }

        String currentKeyword = context.readNextKeyword();

        if(currentKeyword == null) {
            return false;
        }

        try {
            count = Integer.parseInt(currentKeyword);

            expression = new CommandListExpression();

            if(context.readNextKeyword() == null) {
                return false;
            }

            return expression.parse(context);

        } catch(NumberFormatException e) {
            // loop 다음에 숫자가 안오면 틀린 구문이므로 false
            return false;
        }
    }


    @Override
    public boolean run() {

        for(int i = 0; i < count; i++) {
            if(!expression.run()) {
                return false;
            }
        }

        return true;
    }


    @Override
    public String toString() {
        return "LoopCommandExpression{" + "count=" + count + ") " + expression;
    }
}
