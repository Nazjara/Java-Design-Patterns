package nazjara.public_class;

public class Client {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setInternalState("Internal state 1");
        System.out.println("State after creating - " + originator.getInternalState());

        caretaker.save(originator.createMomento());
        System.out.println("Saving first state");

        originator.setInternalState("Internal state 2");
        System.out.println("Updating state to - " + originator.getInternalState());

        caretaker.save(originator.createMomento());
        System.out.println("Saving second state");

        originator.setInternalState("Internal state 3");
        System.out.println("Updating state to - " + originator.getInternalState());

        System.out.println("First saved state - " + caretaker.restore(0).getInternalState());
        System.out.println("Second saved state - " + caretaker.restore(1).getInternalState());

        originator.restoreFromMomento(caretaker.restore(1));
        System.out.println("Restoring state to second value");
        System.out.println("Current state - " + originator.getInternalState());

        originator.restoreFromMomento(caretaker.restore(0));
        System.out.println("Restoring state to first value");
        System.out.println("Current state - " + originator.getInternalState());
    }
}
