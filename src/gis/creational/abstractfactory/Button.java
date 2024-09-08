package gis.creational.abstractfactory;

/**
 * 먼저 만들어야 할 컴포넌트들을 추상적으로 정하고 어떤 구체적인 상황이 주어지면 각 컴포넌트들을 구체적으로 만드는 패턴
 */
public abstract class Button {

    protected String caption;


    public Button(String caption) {
        this.caption = caption;
    }


    public void clickEvent() {
        System.out.println(caption + " 버튼을 클릭");
    }


    abstract void render();
}
