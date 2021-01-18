package gb_2_1.players;

public class Robot implements Players {
    private int maxRun;
    private int maxJump;

    public Robot(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Robot() {
        this (3000, 2);
    }

    @Override
    public boolean run(int dist) {
        if (dist<= maxRun) {
            System.out.println("Robot run: true");
            return true;
        } else {
            System.out.println("Robot run: false");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.println("Robot jump: true");
            return true;
        } else {
            System.out.println("Robot jump: false");
            return false;
        }
        
    }
}
