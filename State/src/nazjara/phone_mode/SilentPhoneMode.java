package nazjara.phone_mode;

public class SilentPhoneMode implements PhoneMode {

    @Override
    public void alert() {
        System.out.println("Phone is now in silent mode");
    }
}
