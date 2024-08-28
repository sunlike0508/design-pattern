package behavioral.template;

import java.util.ArrayList;

public class CaptionDisplayArticle extends DisplayArticleTemplate{

    public CaptionDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println("Title : " + article.getTitle());
    }


    @Override
    protected void content() {
        System.out.println("Title : ");

        ArrayList<String> content = article.getContent();

        int cntLines = content.size();

        for(int i = 0; i < cntLines; i++) {
            System.out.println("     " + content.get(i));
        }
    }


    @Override
    protected void footer() {
        System.out.println("Footer : "  + article.getFooter());
    }
}
