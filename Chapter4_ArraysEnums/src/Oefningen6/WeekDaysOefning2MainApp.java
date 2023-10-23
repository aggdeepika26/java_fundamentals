package Oefningen6;

public class WeekDaysOefning2MainApp {
    public static void main(String[] args) {
        WeekDays[] dagen = WeekDays.values();


        WeekDays day = WeekDays.FRIDAY;
        switch(day)
        {
            case SUNDAY:
                System.out.println("SUNDAY");
                break;
            case MONDAY:
                System.out.println("MONDAY");
                break;
            case TUESDAY:
                System.out.println("TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("THURSDAY");
                break;
            case FRIDAY:
                System.out.println(" FRIDAY");
                break;
            case SATURDAY:
                System.out.println(" SATURDAY");
                break;

        }



    }
}
