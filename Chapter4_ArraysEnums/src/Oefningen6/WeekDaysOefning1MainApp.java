package Oefningen6;

public class WeekDaysOefning1MainApp {
    public static void main(String[] args)
    {
        WeekDays[] weekDaysArr = WeekDays.values();
        for (WeekDays element: weekDaysArr)
        {
            System.out.println(element + " at index  " + element.ordinal());
        }


    }
}
