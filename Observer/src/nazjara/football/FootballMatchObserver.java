package nazjara.football;

public class FootballMatchObserver implements Observer {
    private String name;

    public FootballMatchObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Object update) {
        System.out.println(name + " is notified that: " + update);
    }

    public String getName() {
        return name;
    }
}
