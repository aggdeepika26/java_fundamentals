//Program om number is positief of negatief te controleren met conditional operator
package be.intecbrussel.les4.Oefening3;
import java.util.Scanner;
public class Oefning4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter number to check wheather it is positive or negative");
        int number = myScanner.nextInt();
        String msg = (number<0)? "This is negative number":"This is positive number";
        System.out.println(msg);
    }
}
