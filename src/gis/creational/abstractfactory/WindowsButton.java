package gis.creational.abstractfactory;

public class WindowsButton extends Button {

    public WindowsButton(String caption) {
        super(caption);
    }


    @Override
    void render() {
        System.out.println("Windows 랜더링 api를 이용해 " + this.caption + " 버튼 그림");
    }
}
