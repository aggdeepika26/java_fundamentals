// to Check wheather the number is positieve negative or 0
package be.intecbrussel.les4.Oefening3;
import java.util.Scanner;
public class Oefning2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter number");
        int input = myScanner.nextInt();
        if (input>0)
        {
            System.out.println(input + " is een positief nummer");
        }
        else if (input < 0)
        {
            System.out.println(input + " is een negatief nummer");
        }
        else
        {
            System.out.println( " the nummer is 0");
        }
    }
}
