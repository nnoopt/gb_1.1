package gb_2_1;

import gb_2_1.obstacles.Obstacles;
import gb_2_1.obstacles.Road;
import gb_2_1.obstacles.Wall;
import gb_2_1.players.Cat;
import gb_2_1.players.Human;
import gb_2_1.players.Players;
import gb_2_1.players.Robot;

public class Main {
    public static void main(String[] args) {
        Players [] players = {
              new Human(500,2),
              new Cat(700, 4),
              new Robot(10000, 100)
        };

        Obstacles [] obstacles = {
                new Road(5000),
                new Wall(4)

        };

        for (Players p : players) {
            for (Obstacles o : obstacles) {
                if (!o.doIt(p)) break;
            }

        }


    }
}
