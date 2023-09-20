package be.intecbrussel.les4;
import java.util.Scanner;
public class switchExample2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter option i,we,you, our");
        String exp = myScanner.nextLine();

        switch(exp)
        {
            case "i":
                System.out.println("I want to become a doctor");
                break;
            case "we":
                System.out.println("We are Indian");
                break;
            case "you":
                System.out.println("You are my crony friend");
                break;
            case "our":
                System.out.println("Our Indian flag has tri-color");
                break;
            default:
                System.out.println("It is the default statement");

        }
    }


}
