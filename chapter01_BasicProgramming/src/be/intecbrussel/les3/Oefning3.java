package be.intecbrussel.les3;
import java.util.Scanner;
public class Oefning3 {
    public static void main(String[] args)
    {
     Scanner myScanner = new Scanner(System.in);
        System.out.println("Enetr First number");
        int first_Nummer = myScanner.nextInt();
        System.out.println("Enetr Second number");
        int second_Nummer = myScanner.nextInt();
        int sum = first_Nummer+second_Nummer;
        int sub = second_Nummer-first_Nummer;
        int mul = first_Nummer*second_Nummer;
        int div = second_Nummer/first_Nummer;
        int mod = second_Nummer%first_Nummer;
        System.out.println("Sum of the two numbers is"+ sum);
        System.out.println("Multiplication of the two numbers is"+ mul);
        System.out.println("Subtraction of the two numbers is"+ sub);
        System.out.println("Division of the two numbers is"+ div);
        System.out.println("Modulus of the two numbers is"+ mod);

    }
}
