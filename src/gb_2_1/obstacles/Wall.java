package gb_2_1.obstacles;

import gb_2_1.players.Players;

public class Wall implements Obstacles{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public Wall() {
        this (10);
    }

    @Override
    public boolean doIt(Players p) {
        return p.jump(height);
    }
}
