package nazjara.cars;

public interface Builder {
    void buildBody();
    void insertWheels();
    void addHeadLights();
    Product getVehicle();
}
