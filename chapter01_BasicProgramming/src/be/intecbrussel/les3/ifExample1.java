package be.intecbrussel.les3;
import java.util.Scanner;
public class ifExample1
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter number");
        int nummer = myScanner.nextInt();
        if (nummer<100)
        {
            System.out.println("The value of number is less than 100");
        }
        else
        {
            System.out.println("The value of number is not less than 100");
        }

    }

}
