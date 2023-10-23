package be.intecbrussel.Les2;
import java.util.Random;
public class randomOefning {
    public static void main(String[] args) {
        Random myRandom = new Random();
        System.out.println(Math.random());
        System.out.println("Boolean");
        boolean randomBoolean = myRandom.nextBoolean();
        System.out.println(randomBoolean );
        Double randomDouble = myRandom.nextDouble();
        System.out.println(randomDouble );
        float randomFloat = myRandom.nextFloat();
        System.out.println(randomFloat );
        int randomInt = myRandom.nextInt();
        System.out.println(randomInt);
        int randomIntBound = myRandom.nextInt(50);
        System.out.println(randomIntBound);


    }
}
