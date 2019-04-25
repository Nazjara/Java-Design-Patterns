package nazjara.football;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FootballTeam implements Subject {
    private String name;
    private int goalsScored;
    private List<Observer> observers;
    private boolean goalsScoredChanged;

    public FootballTeam(String name) {
        this.name = name;
        observers = new ArrayList<>();
        goalsScored = 0;
        goalsScoredChanged = false;
    }

    @Override
    public void register(Observer observer) {
        Objects.requireNonNull(observer);

        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (goalsScoredChanged) {
            observers.forEach(observer -> observer.update(String.format("%s scored %d goal(s)", name, goalsScored)));
            goalsScoredChanged = false;
        }
    }

    public void scoreGoal() {
        System.out.println(name + " scored a goal! Total goals scored by team - " + ++goalsScored);
        goalsScoredChanged = true;
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public int getGoalsScored() {
        return goalsScored;
    }
}
