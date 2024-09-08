package gis.behavioral.interpreter;

public class BeginExpression implements Expression {

    private CommandListExpression expression;


    public static boolean checkValidKeyword(String currentKeyword) {
        return currentKeyword.equals("BEGIN");
    }


    @Override
    public boolean parse(Context context) {

        // 구문이 올바른지 확인
        if(checkValidKeyword(context.getCurrentKeyword())) {
            context.readNextKeyword();
            expression = new CommandListExpression();
            return expression.parse(context);
        } else {
            return false;
        }
    }


    @Override
    public boolean run() {
        return expression.run();
    }


    @Override
    public String toString() {
        return "Begin " + expression;
    }
}
