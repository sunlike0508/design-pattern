package gis.behavioral.interpreter;


/**
 * 문법에 맞춰 작성된 스크립트를 해석 <p>
 * 해석된 구문을 정해진 규칙대로 실행하는 패턴
 */
public class Main {

    // BEGIN FRONT LOOP 2 BACK RIGHT END BACK END


    public static void main(String[] args) {

        String script = "BEGIN FRONT LOOP 3 RIGHT FRONT LOOP 2 LEFT BACK END END BACK END";
        System.out.println(script);

        Context context = new Context(script);
        Expression begin = new BeginExpression();

        if(begin.parse(context)) {
            System.out.println(begin);

            begin.run();
        }
    }
}
