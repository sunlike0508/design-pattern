package gis.behavioral.mediator;

public class CoolAircon extends Participant {

    private boolean bOn = true;


    public CoolAircon(Mediator mediator) {
        super(mediator);
    }


    public void on() {
        if(bOn) {
            return;
        }

        bOn = true;

        mediator.participantChanged(this);
    }


    public void off() {
        if(!bOn) {
            return;
        }

        bOn = false;

        mediator.participantChanged(this);
    }


    public boolean isRunning() {
        return bOn;
    }


    @Override
    public String toString() {
        if(bOn)
            return "# 에어컨: 켜짐";
        else
            return "# 에어컨: 꺼짐";
    }
}
