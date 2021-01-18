package gb_2_1.players;

public class Cat implements Players {
    private int maxRun;
    private int maxJump;

    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Cat() {
        this (3000, 2);
    }

    @Override
    public boolean run(int dist) {
        if (dist<= maxRun) {
            System.out.println("Cat run: true");
            return true;
        } else {
            System.out.println("Cat run: false");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.println("Cat jump: true");
            return true;
        } else {
            System.out.println("Cat jump: false");
            return false;
        }
    }
}
