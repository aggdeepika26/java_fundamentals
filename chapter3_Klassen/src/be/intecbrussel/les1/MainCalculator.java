package be.intecbrussel.les1;
import java.util.Scanner;


public class MainCalculator {
    // public int static n =0;


    public static void main(String[] args) {


        int n = 0;
        Scanner myScanner = new Scanner(System.in);
        Calculator myCalcObj = new Calculator();
        System.out.println("********************************************");
        System.out.println(" 1. Find Smallest no among three numbers");
        System.out.println(" 2. Returns True if all the digits are even otherwise false");
        System.out.println(" 3. Addition");
        System.out.println(" 4. Subtraction");
        System.out.println(" 5. Multiplication");
        System.out.println(" 6. Division");
        System.out.println(" 7. Remainder");
        System.out.println("*********************************************");

        System.out.println("Enter your choice");
        int choice = myScanner.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Enter three integer number");
                int n1 = myScanner.nextInt();
                int n2 = myScanner.nextInt();
                int n3 = myScanner.nextInt();

                int small = myCalcObj.smallerNumber(n1, n2, n3);
                System.out.println("smallest number is" + small);
                break;
            }


            case 2: {
                System.out.println("Enter no to check all the digits are even or not . If even returns true otherwise false");

                if (myScanner.hasNextInt()) {
                    n = myScanner.nextInt();
                    boolean checkEvenOdd = myCalcObj.evenOdd(n);
                    System.out.println(checkEvenOdd);
                } else {
                    System.out.println("Kindly enter integer no only");
                }

            }

            case 3: {
                double result = myCalcObj.addition();
                System.out.println("Sum is " + result);
            }

        }

    }


}





