//to generate 5 integer no with random
package be.intecbrussel.Les2.Oefening5;
import java.util.Random;
public class Oefning1 {
    public static void main(String[] args) {
        Random myRandom = new Random();
        int num;
        for(int i = 1 ; i<= 5; i++)
        {
            num = myRandom.nextInt();
            System.out.println(num);
        }


    }
}
