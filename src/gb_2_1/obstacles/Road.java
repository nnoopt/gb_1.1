package gb_2_1.obstacles;

import gb_2_1.players.Players;

public class Road implements Obstacles{
    private int dist;

    public Road(int dist) {
        this.dist = dist;
    }

    public Road() {
        this (10);
    }

    @Override
    public boolean doIt(Players p) {
        return p.run(dist);
    }
}
