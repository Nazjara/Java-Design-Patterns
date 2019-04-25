package nazjara.remote_control;

public class OffRemoteControl implements RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("Switching to on state");
        context.setState(new OnRemoteControl());
    }
}
