package nazjara.football;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        FootballTeam team1 = new FootballTeam("Team1");
        FootballTeam team2 = new FootballTeam("Team2");

        Observer observer1 = new FootballMatchObserver("Observer1");
        Observer observer2 = new FootballMatchObserver("Observer2");
        Observer observer3 = new FootballMatchObserver("Observer3");

        FootballMatch footballMatch = new FootballMatch(team1, team2, Arrays.asList(observer1, observer2, observer3));
        footballMatch.startMatch();

        team1.scoreGoal();
        team2.scoreGoal();
        team1.scoreGoal();

        System.out.println("Unregistering " + observer1.getName() + " from football match");
        team1.unregister(observer1);
        team2.unregister(observer1);

        team1.scoreGoal();

        footballMatch.endMatch();
    }
}
