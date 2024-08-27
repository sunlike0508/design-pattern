package bridge;

public class CaptionDisplay implements Display{

    @Override
    public void title(Draft draft) {
        System.out.println("Caption 제목: " + draft.getTitle());
    }


    @Override
    public void author(Draft draft) {
        System.out.println("Caption 작가: " + draft.getAuthor());
    }


    @Override
    public void content(Draft draft) {
        var content = draft.getContent();

        for(var i = 0 ; i < content.length; i++) {
            System.out.println("Caption 내용 : " + content[i]);
        }
    }
}
