package gis.behavioral.template;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String title = "디자인패턴 타이틀";

        ArrayList<String> content = new ArrayList<>();
        content.add("디지안 패턴 1");
        content.add("디지안 패턴 2");
        content.add("디지안 패턴 3");
        content.add("디지안 패턴 4");

        String footer = "디자인 패턴 푸터";

        Article article = new Article(title, content, footer);

        System.out.println("case - 1");
        DisplayArticleTemplate displayArticleTemplate = new SimpleDisplayArticle(article);
        displayArticleTemplate.display();
        ;

        System.out.println("case - 2");
        DisplayArticleTemplate displayArticleTemplate2 = new CaptionDisplayArticle(article);
        displayArticleTemplate2.display();
    }
}
