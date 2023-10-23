//Het Programma gaat over rekening van de electriciteit
package be.intecbrussel.les5.Opdracht2;
import java.util.Scanner;
public class ElectriciteitApp
{
    public static void main(String[] args)
    {
        System.out.println("Do you want to generate Electricity for multiple houses Y/N");
        Scanner myScanner = new Scanner(System.in);
        char choice = myScanner.next().toLowerCase().charAt(0);
        if (choice == 'y') {
            System.out.println("Enter no. of houses for which you want to generate bill ");
            int n = myScanner.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println("Enter the name of consumer: ");
                String naam = myScanner.next();
                System.out.println("Power in watts per hour: ");
                float wattPHour = myScanner.nextFloat();
                System.out.println("No of hours per day that eletricity is used: ");
                float hoursPDay = myScanner.nextFloat();
                System.out.println("No of days per month on which electricity is used: ");
                int daysPMonth = myScanner.nextInt();
                System.out.println("Enter Unit Price : ");
                float unitPrice = myScanner.nextFloat();
                float bill = (wattPHour * hoursPDay * daysPMonth) * unitPrice;
                System.out.println("*******************************************");
                System.out.println();
                System.out.println("Name of Consumer is " + naam);
                System.out.println("Electricty cost for one month is" + bill);
                System.out.println();
                System.out.println("********************************************");
            }
        }

        else if(choice== 'n')
        {
            System.out.println("Enter the name of consumer: ");
            String naam = myScanner.next();
            System.out.println("Power in watts per hour: ");
            float wattPHour = myScanner.nextFloat();
            System.out.println("No of hours per day that eletricity is used: ");
            float hoursPDay = myScanner.nextFloat();
            System.out.println("No of days per month on which electricity is used: ");
            int daysPMonth = myScanner.nextInt();
            System.out.println("Enter Unit Price : ");
            float unitPrice = myScanner.nextFloat();
            float bill = (wattPHour * hoursPDay * daysPMonth) * unitPrice;
            System.out.println("*******************************************");
            System.out.println();
            System.out.println("Name of Consumer is " + naam);
            System.out.println("Electricty cost for one month is" + bill);
            System.out.println();
            System.out.println("********************************************");

        }
        else
        {
            System.out.println("Sorry your option is invalid");
        }
        System.out.println("Thank you");

    }
}
