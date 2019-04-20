package nazjara;

public interface RobotInterface {
    void print();

    // this is extrinsic data (should be set from client)
    void setColor(String color);
}
