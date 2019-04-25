package nazjara.remote_control;

public class Client {

    public static void main(String[] args) {
        RemoteControl off = new OffRemoteControl();

        TV tv = new TV(off);
        tv.pressButton();
        tv.pressButton();
    }
}
