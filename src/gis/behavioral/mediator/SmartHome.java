package gis.behavioral.mediator;

public class SmartHome implements Mediator {

    public Door door = new Door(this);
    public Window window = new Window(this);
    public CoolAircon coolAircon = new CoolAircon(this);
    public HeatBoiler heatBoiler = new HeatBoiler(this);


    @Override
    public void participantChanged(Participant participant) {
        if(participant == door && door.isOpen()) {
            coolAircon.off();
            heatBoiler.off();
        }

        if(participant == window && window.isOpen()) {
            coolAircon.off();
            heatBoiler.off();
        }

        if(participant == coolAircon && coolAircon.isRunning()) {
            heatBoiler.off();
            door.close();
            window.close();
        }

        if(participant == heatBoiler && heatBoiler.isRunning()) {
            coolAircon.off();
            door.close();
            window.close();
        }
    }


    public void report() {
        System.out.println("[집안상태]");
        System.out.println(door);
        System.out.println(window);
        System.out.println(coolAircon);
        System.out.println(heatBoiler);
        System.out.println();
    }
}
