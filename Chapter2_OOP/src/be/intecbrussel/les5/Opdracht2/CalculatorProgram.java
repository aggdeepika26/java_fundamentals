//Het programma vertelt je bent een volwassen ,tiener,kind of baby
package be.intecbrussel.les5.Opdracht2;
import java.util.Scanner;
public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        char choice = 'y';
        while (choice == 'y' || choice == 'Y') {
            System.out.println("Welcome to age calculator program");
            System.out.println("Enter your age");
            int age = myScanner.nextInt();
            if (age >= 18) {
                System.out.println("You are an adult");

            } else if ((age >= 10))
            {
                System.out.println("You are a teenager");
            } else if ((age >= 2))
            {
                System.out.println("You are a child");
            } else {
                System.out.println("You are a baby");
            }
            System.out.println("Do you want to check for another age group press y for yes or press n for no");
            choice = myScanner.next().charAt(0);


        }


    }

}
