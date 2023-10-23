package be.intecbrussel.les4;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDate justTheDate = LocalDate.now();
        LocalTime justTheTime = LocalTime.now();

        System.out.println(justTheDate);
        System.out.println(justTheTime);
        System.out.println("now " + LocalDateTime.now());
       // System.out.println("Apr 15, 1994, 11:30am" + LocalDateTime.of());




    }
}
