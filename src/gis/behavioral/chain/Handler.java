package gis.behavioral.chain;

/**
 * 책임이란 무언가를 처리하는 기능(클래스)
 * <p></p>
 * 여러개의 책임들을 동적으로 연결해서 순차적으로 실행하는 패턴
 * <p></p>
 * 기능을 클래스 별로 분리하여 구현하도록 유도하므로 클래스의 코드가 최적화 된다
 */
public abstract class Handler {

    protected Handler nextHandler = null;


    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }


    protected abstract void process(String url);


    public void run(String url) {
        process(url);

        if(nextHandler != null) {
            nextHandler.run(url);
        }
    }
}
