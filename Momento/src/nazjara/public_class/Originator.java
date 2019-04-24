package nazjara.public_class;

public class Originator {

    private String internalState;

    public Momento createMomento() {
        return new Momento(internalState);
    }

    public void restoreFromMomento(Momento momento) {
        internalState = momento.getInternalState();
    }

    public String getInternalState() {
        return internalState;
    }

    public void setInternalState(String internalState) {
        this.internalState = internalState;
    }
}
