package be.intecbrussel.les5.Oefeningen7;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Oefening2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting" + now);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("E,MMM dd yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println("After formatting  "+ formatDateTime);

    }
}
