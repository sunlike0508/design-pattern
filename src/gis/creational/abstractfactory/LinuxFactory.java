package gis.creational.abstractfactory;

public class LinuxFactory extends ComponentFactory {

    @Override
    public Button createButton(String caption) {
        return new LinuxButton(caption);
    }
}
