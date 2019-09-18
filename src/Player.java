import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<Plot> portfolio = new ArrayList<Plot>();
    int wealth;
    int turnOrderPosition;

    Player (String playerName, int position) {
        this.name = playerName;
        wealth = 30000;
        this.turnOrderPosition = position;
    }

}
