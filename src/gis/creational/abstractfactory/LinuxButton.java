package gis.creational.abstractfactory;

public class LinuxButton extends Button {

    public LinuxButton(String caption) {
        super(caption);
    }


    @Override
    void render() {
        System.out.println("Linux 랜더링 api를 이용해 " + this.caption + " 버튼 그림");
    }
}
