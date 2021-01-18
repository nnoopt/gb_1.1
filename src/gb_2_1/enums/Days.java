package gb_2_1.enums;

public enum Days {
    Monday (true), Tuesday (true),
    Wednesday (true), Thursday (true), Friday (true), Saturday (false), Sunday (false);

    private boolean working;
    static final int HOURS = 8;

    Days(boolean working) {
        this.working = working;
    }

    public boolean isWorking() {
        return working;
    }
}
