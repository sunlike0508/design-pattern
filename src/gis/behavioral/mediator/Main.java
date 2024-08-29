package gis.behavioral.mediator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();

        try(Scanner scanner = new Scanner(System.in)) {
            do {
                smartHome.report();

                System.out.println("[1] 문열기");
                System.out.println("[2] 문닫기");
                System.out.println("[3] 창문열기");
                System.out.println("[4] 창문닫기");
                System.out.println("[5] 에어콘켜기");
                System.out.println("[6] 에어콘끄기");
                System.out.println("[7] 보일러켜기");
                System.out.println("[8] 보일러끄기");
                System.out.println("[9] 상태창");
                System.out.print("입력 : ");

                int i = scanner.nextInt();

                switch(i) {
                    case 1 -> smartHome.door.open();
                    case 2 -> smartHome.door.close();
                    case 3 -> smartHome.window.open();
                    case 4 -> smartHome.window.close();
                    case 5 -> smartHome.coolAircon.on();
                    case 6 -> smartHome.coolAircon.off();
                    case 7 -> smartHome.heatBoiler.on();
                    case 8 -> smartHome.heatBoiler.off();
                    case 9 -> smartHome.report();
                    default -> System.out.println("입력 번호가 아님");
                }
            } while(true);
        }
    }
}