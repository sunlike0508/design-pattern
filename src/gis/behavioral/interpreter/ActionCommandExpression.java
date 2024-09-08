package gis.behavioral.interpreter;

public class ActionCommandExpression extends CommandExpression {

    public ActionCommandExpression(String keyword) {
        super(keyword);
    }


    public static boolean checkValidKeyword(String currentKeyword) {
        return currentKeyword.equals("FRONT") || currentKeyword.equals("BACK") || currentKeyword.equals("LEFT")
                || currentKeyword.equals("RIGHT");
    }


    @Override
    public boolean parse(Context context) {
        if(!checkValidKeyword(keyword)) {
            return false;
        }

        // 다음 구문이 없으면 실패. 왜냐하면 실행 구문은 최소 뒤에 1개는 있어야 한다. (END 또는 다음 실행구만)
        return context.readNextKeyword() != null;
    }


    @Override
    public boolean run() {
        System.out.println("cmd : " + keyword);
        return true;
    }


    @Override
    public String toString() {
        return keyword;
    }
}
