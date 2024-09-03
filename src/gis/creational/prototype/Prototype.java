package gis.creational.prototype;

/**
 * 실행 중에 생성된 객체로 다른 객체를 생성하는 패턴
 * <p></p>
 * 프로토타입으로 만든 객체의 상태를 변경해도 원본 객체의 상태는 변경되지 않음.(깊은 복사)
 */
public interface Prototype {

    Object copy(); // 프로토타입 복사로 object를 많이 쓴다.
}
