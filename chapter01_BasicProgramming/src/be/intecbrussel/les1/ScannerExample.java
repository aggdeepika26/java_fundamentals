package be.intecbrussel.les1;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        //Creeet een Scanner object
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enetr username");
        String userName = myScanner.nextLine();
        System.out.println("User Name is :" + userName);

    }

}
