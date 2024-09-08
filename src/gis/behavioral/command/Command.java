package gis.behavioral.command;

/**
 * 하나의 명령(기능)을 객체화된 패턴 <p></p>
 * 객체는 전달할 수 있고 보관할 수 있음, 즉, 명령(기능)을 전달하고 보관할 수 있게 됨 <p></p>
 * 배치 실행 undo, redo 가능. 우선순위가 높은 명령을 먼저 실행하기 등이 가능해 짐
 */
public interface Command {

    void run();
}
