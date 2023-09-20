//Hoeveel dagen in de maand met switch
package be.intecbrussel.les4.Oefening3;
import java.util.Scanner;
public class Oefning3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter month in small letters");
        String month = myScanner.nextLine();
        switch(month)
        {
            case "january":
                System.out.println("No of days in January are" + "31");
                break;
            case "february":
                System.out.println("No of days in february are" + "28");
                break;
            case "march":
                System.out.println("No of days in march are" + "31");
                break;

            case "april":
                System.out.println("No of days in april are" + "30");
                break;
            case "may":
                System.out.println("No of days in may are" + "31");
                break;
            case "june":
                System.out.println("No of days in June are" + "30");
                break;
            case "july":
                System.out.println("No of days in July are" + "31");
                break;
            case "august":
                System.out.println("No of days in august are" + "31");
                break;
            case "september":
                System.out.println("No of days in september are" + "30");
                break;
            case "october":
                System.out.println("No of days in october are" + "31");
                break;
            case "november":
                System.out.println("No of days in november are" + "30");
                break;
            case "december":
                System.out.println("No of days in december are" + "31");
                break;
            default:
                System.out.println("Kindly enter correct month");



        }


    }
}
