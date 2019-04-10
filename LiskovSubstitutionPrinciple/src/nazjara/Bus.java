package nazjara;

public class Bus extends Vehicle {

    @Override
    int getSpeed() {
        return 50;
    }

    @Override
    int getCubicCapacity() {
        return 3000;
    }

    String getEmergencyExitLocation() {
        return "Location";
    }
}
