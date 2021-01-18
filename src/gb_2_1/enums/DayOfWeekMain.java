package gb_2_1.enums;

public class DayOfWeekMain {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(Days.Monday));
    }

    public static String getWorkingHours(Days d){
        int h=0;

        for (Days days : Days.values()) {
            if (days.compareTo(d)<0) continue;
            if (days.isWorking()) h=h+(days.HOURS);
        }

        if (h==0) return "Сегодня выходной";
        return "До конца недели осталось "+ h + " часов!";
    }
}
