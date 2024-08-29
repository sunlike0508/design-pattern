package gis.behavioral.mediator;

public class Window extends Participant {

    private boolean bClosed = true;


    public Window(Mediator mediator) {
        super(mediator);
    }


    public void open() {
        if(!bClosed) {
            return;
        }

        bClosed = false;

        mediator.participantChanged(this);
    }


    public void close() {
        if(bClosed) {
            return;
        }

        bClosed = true;

        mediator.participantChanged(this);
    }


    public boolean isClosed() {
        return bClosed;
    }


    public boolean isOpen() {
        return !bClosed;
    }


    @Override
    public String toString() {
        if(bClosed)
            return "# 창: 닫힘";
        else
            return "# 칭: 열림";
    }
}
