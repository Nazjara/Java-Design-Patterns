package nazjara.football;

import java.util.List;

public class FootballMatch {

    private FootballTeam team1;
    private FootballTeam team2;
    private List<Observer> observers;

    public FootballMatch(FootballTeam team1, FootballTeam team2, List<Observer> observers) {
        this.team1 = team1;
        this.team2 = team2;
        this.observers = observers;
    }

    public void startMatch() {
        System.out.println(String.format("The match has started! Teams: %s - %s", team1.getName(), team2.getName()));

        observers.forEach(observer -> team1.register(observer));
        observers.forEach(observer -> team2.register(observer));
    }

    public void endMatch() {
        System.out.println(String.format("The match has ended! Total score: %s - %d, %s - %d", team1.getName(),
                team1.getGoalsScored(), team2.getName(), team2.getGoalsScored()));

        observers.forEach(observer -> team1.unregister(observer));
        observers.forEach(observer -> team2.unregister(observer));
    }
}
