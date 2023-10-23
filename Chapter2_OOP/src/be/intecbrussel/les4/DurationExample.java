package be.intecbrussel.les4;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
public class DurationExample {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime oldDate = LocalDateTime.of(2016,8,31,10,20,55);
        String formattedDate = ldt.format(myFormatter);
        //Duration seconds


    }
}
