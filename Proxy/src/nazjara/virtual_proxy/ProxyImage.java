package nazjara.virtual_proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    // virtual proxy allows for creation of a memory intensive objects on demand
    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }
}
