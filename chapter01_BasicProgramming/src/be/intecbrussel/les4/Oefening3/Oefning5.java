//Maak een program om te controleren dat het gegeven nummer even of oneven is
package be.intecbrussel.les4.Oefening3;
import java.util.Scanner;
public class Oefning5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to EvenOdda");
        System.out.println("Enter a no to check wheather it is an odd or even  ");
        int number = myScanner.nextInt();
        if(number%2 == 0)
        {
            System.out.println("This is an even number");
            System.out.println("Thank you for using our application");

        }
        else
        {
            System.out.println("This is an odd number");
            System.out.println("Thank you for using our application");
        }

    }
}
