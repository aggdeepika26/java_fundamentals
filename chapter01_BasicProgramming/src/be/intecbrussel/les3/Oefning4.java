package be.intecbrussel.les3;

import java.util.Scanner;
import java.util.Scanner;
public class Oefning4
{
    public static void main(String[] args)
    {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter jouw naam");
        String naam = myScanner.nextLine();
        System.out.println("Enetr age");
        int age = myScanner.nextInt();
        System.out.println("Enetr telefoonnummer");
        long tele_Nummer = myScanner.nextLong();
        System.out.println("jouw naam    "+ naam + "Age    "+ age + "jouw telefoonnummer is  "+ tele_Nummer);

    }
}
