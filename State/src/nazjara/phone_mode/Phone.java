package nazjara.phone_mode;

public class Phone {
    private PhoneMode phoneMode;

    public Phone(PhoneMode phoneMode) {
        this.phoneMode = phoneMode;
    }

    public PhoneMode getPhoneMode() {
        return phoneMode;
    }

    public void setPhoneMode(PhoneMode phoneMode) {
        this.phoneMode = phoneMode;
    }

    public void alert() {
        phoneMode.alert();
    }
}
