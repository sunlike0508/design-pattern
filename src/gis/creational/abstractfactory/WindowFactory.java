package gis.creational.abstractfactory;

public class WindowFactory extends ComponentFactory {

    @Override
    public Button createButton(String caption) {
        return new WindowsButton(caption);
    }
}
