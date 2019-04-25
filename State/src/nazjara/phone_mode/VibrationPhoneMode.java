package nazjara.phone_mode;

public class VibrationPhoneMode implements PhoneMode {

    @Override
    public void alert() {
        System.out.println("Phone is now in vibration mode");
    }
}
