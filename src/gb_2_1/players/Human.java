package gb_2_1.players;

public class Human implements Players{
    private int maxRun;
    private int maxJump;

    public Human(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Human() {
        this (300, 2);
    }

    @Override
    public boolean run(int dist) {
        if (dist<= maxRun) {
            System.out.println("Human run: true");
            return true;
        } else {
            System.out.println("Human run: false");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.println("Human jump: true");
            return true;
        } else {
            System.out.println("Human jump: false");
            return false;
        }
    }
}
