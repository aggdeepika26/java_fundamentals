package be.intecbrussel.les5.Oefeningen7;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
public class Oefening3
{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1980, Month.NOVEMBER,26);
        Period period = Period.between(birthDate,today);
        System.out.print(period.getYears() + "Years ,");
        System.out.print(period.getMonths() + "Months ,");
        System.out.print(period.getDays() + "Days ,");
    }


}
