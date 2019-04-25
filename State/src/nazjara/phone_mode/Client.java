package nazjara.phone_mode;

public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone(new VibrationPhoneMode());
        phone.alert();
        phone.alert();

        phone.setPhoneMode(new SilentPhoneMode());
        phone.alert();
        phone.alert();
        phone.alert();
    }
}
