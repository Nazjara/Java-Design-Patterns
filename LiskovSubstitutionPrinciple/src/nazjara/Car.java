package nazjara;

public class Car extends Vehicle {

    @Override
    int getSpeed() {
        return 1000;
    }

    @Override
    int getCubicCapacity() {
        return 1500;
    }

    boolean sHatchBack() {
        return true;
    }
}
