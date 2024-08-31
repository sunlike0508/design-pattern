package gis.structural.proxy;

public class MainEntry {

    public static void main(String[] args) {
        //        Display display = new ScreenDisplay();
        //
        //        display.print("hi");
        //        display.print("hi2");
        //        display.print("hi3");
        //        display.print("hi4");
        //        display.print("hi5");
        //        display.print("hi6");
        //        display.print("hi7");


        Display display = new BufferDisplay(5);

        display.print("hi");
        display.print("hi2");
        display.print("hi3");
        display.print("hi4");
        display.print("hi5");
        display.print("hi6");
        display.print("hi7");

        ((BufferDisplay) display).flush();
    }
}
