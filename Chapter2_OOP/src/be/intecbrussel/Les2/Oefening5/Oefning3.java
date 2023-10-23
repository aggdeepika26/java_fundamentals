//Game to check your no matches to random no or not
package be.intecbrussel.Les2.Oefening5;
import java.util.Random;
import java.util.Scanner;
public class Oefning3 {
    public static void main(String[] args) {
        Random myRandom = new Random();
        Scanner myScanner = new Scanner(System.in);
        boolean ans = true;
        char choice = 'y';
        while(choice == 'y'|| choice == 'Y')
        {
            System.out.println("Enter no from 0 to 10 only");
            int guessNo = myScanner.nextInt();
            int randomNo = myRandom.nextInt(11);
            if(guessNo == randomNo)
            {
                System.out.println("Random No. is" + randomNo);
                System.out.println("Hey you won the game");

            }
            else
            {
                System.out.println("Random No. is" + randomNo);
                System.out.println("Oh sorry you lost the game");
            }
            System.out.println("Do you want to play again press y for yes or n for No");
            myScanner.nextLine();
            choice = myScanner.nextLine().charAt(0);

        }
        System.out.println("Thanks for playing game");
    }
}
