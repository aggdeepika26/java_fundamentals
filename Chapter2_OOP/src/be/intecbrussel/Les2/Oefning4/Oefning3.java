package be.intecbrussel.Les2.Oefning4;
import java.util.Random;
public class Oefning3 {
    public static void main(String[] args) {
        int noRandom = (int) (Math.round(Math.random() * 60));
        System.out.println("Random no.between 0 to 60 is" + noRandom);
        if (noRandom % 2 == 0) {
            System.out.println("This is a even no");
        } else {
            System.out.println("This is a odd no");

        }
    }
}
