// Het is een speeltje  programma met random nummer and guess nummer
package be.intecbrussel.les5.Opdracht2;
import java.util.Random;
import java.util.Scanner;
public class HigherLowerApp
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Higher Lower App");
        boolean doesNotMatch = true;
        Scanner myScanner = new Scanner(System.in);
        Random myRandom = new Random();
        char choice = 'y' ;
        while (choice == 'y')
        {
            while (doesNotMatch == true)
            {
                System.out.println("Enter number from 0 to 99 only");
                int guessedNumber = myScanner.nextInt();
                if ((guessedNumber < 0) || (guessedNumber > 99))
                {
                    System.out.println("Sorry you can enter no from 0 to 99 only");
                    break;
                }
                int randomNumber = myRandom.nextInt(100);
                System.out.println("Randomly generated no is"+randomNumber);
                if (guessedNumber < randomNumber)
                {
                    System.out.println("Oh no random number is Higher than the guessed number");
                }
                else if (guessedNumber > randomNumber)
                {
                    System.out.println("Oh no random number is Lower than the guessed number");
                }
                else
                {
                    System.out.println("Congrats !");
                    doesNotMatch = false;
                }
            }
            System.out.println("Do you want to play again press y for yes or press n for no");
            choice = myScanner.next().charAt(0);
        }

        System.out.println("Thank you for choosing our App");

    }
}

