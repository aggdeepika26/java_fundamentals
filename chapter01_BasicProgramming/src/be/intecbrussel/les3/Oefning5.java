package be.intecbrussel.les3;

import java.util.Scanner;

public class Oefning5 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter First number");
        int first_Nummer = myScanner.nextInt();
        System.out.println("Enter Second number");
        int second_Nummer = myScanner.nextInt();
        System.out.println("Enter Third number");
        int th_Nummer = myScanner.nextInt();
        System.out.println("Enter Fourth number");
        int fourth_Nummer = myScanner.nextInt();
        System.out.println("Enter Fifth number");
        int fifth_Nummer = myScanner.nextInt();
        int sum = first_Nummer + second_Nummer + th_Nummer + fourth_Nummer + fifth_Nummer;
        float avg = sum/5;
        System.out.println("Sum of five numbers is" + sum);
        System.out.println("Average of five numbers is" + avg);
    }

}
