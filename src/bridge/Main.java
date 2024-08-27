package bridge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String title = "bridge 제목";
        String author = "bridge 저자";
        String[] content = {"디지안 패턴 1", "디지안 패턴 2", "디지안 패턴 3", "디지안 패턴 4"};

        Draft draft = new Draft(title, author, content);

        Display simpleDisplay = new SimpleDisplay();
        draft.print(simpleDisplay);

        System.out.println();

        Display captionDisplay = new CaptionDisplay();
        draft.print(captionDisplay);

        System.out.println();

        // 위의 상황에서 기존의 기능은 그대로 둔채 출판사와 가격도 추가된다고 해보자.
        String publisher = "출판사";
        int cost = 1000;

        Publication publication = new Publication(title, author, content, publisher, cost);
        publication.print(simpleDisplay);

        System.out.println();

        publication.print(captionDisplay);
    }
}
