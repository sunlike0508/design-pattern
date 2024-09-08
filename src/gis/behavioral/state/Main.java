package gis.behavioral.state;

import java.util.Scanner;

/**
 * 상태를 객체화 한 패턴 <p></p>
 * 조건(if)를 효과적으로 줄여주는 패턴
 */
public class Main {

    public static void main(String[] args) {

        Player player = new Player();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("플레이어 상태 :" + player.getState().getDescription());
            System.out.println("속도 : " + player.getSpeed());

            String input = scanner.next();

            if(input.equals("1")) {
                player.getState().run();
            } else if(input.equals("2")) {
                player.getState().walk();
            } else if(input.equals("3")) {
                player.getState().stop();
            } else {
                break;
            }
        }
    }
}
