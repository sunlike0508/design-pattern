package gis.creational.singleton;

public class King {

    private static King self = null;


    private King() {

    }


    // 멀티쓰레드 환경에서 동기화하기 위해서 sync 붙임
    public static synchronized King getInstance() {
        if(self == null) {
            self = new King();
        }

        return self;
    }


    public void say() {
        System.out.println("I am only one ....");
    }
}
