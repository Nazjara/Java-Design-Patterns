package nazjara;

class Client {
    private Service service;

    public Client(Service service) { // injection via constructor
        this.service = service;
    }

    public void doSomething() {
        service.write("Message");
    }

    public void setService(Service service) { // injection via setter
        this.service = service;
    }

    public static void main(String[] args) {
        Service service = new ServiceImpl();

        Client client = new Client(service);
        client.doSomething();

        client.setService(service);
        client.doSomething();
    }
}
