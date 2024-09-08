package gis.behavioral.interpreter;

public interface Expression {

    // context가 제공하는 구문이 올바른지 확인하고 구문에 맞는 구체적인 인스턴스를 생성
    boolean parse(Context context);

    // 생성된 인스턴스의 실행
    boolean run();
}
