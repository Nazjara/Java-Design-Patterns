package nazjara.remote_control;

public class OnRemoteControl implements RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("Switching to off state");
        context.setState(new OffRemoteControl());
    }
}
