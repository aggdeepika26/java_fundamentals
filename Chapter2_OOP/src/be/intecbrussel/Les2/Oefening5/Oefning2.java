package be.intecbrussel.Les2.Oefening5;
import java.util.Random;
public class Oefning2 {
    public static void main(String[] args) {
        Random myRandom = new Random();

        for (int i = 1; i<= 6 ; i++)
        {
         int myRanNo = myRandom.nextInt(45);
         System.out.println(myRanNo);
        }
    }
}
