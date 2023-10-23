package be.intecbrussel.les1;
import java.util.Scanner;
public class test {

        public static void main(String[] args) {
            Scanner mijnScanner = new Scanner(System.in);
            System.out.print("Voer uw leeftijd in: ");
            System.out.println(mijnScanner.hasNextInt());
            int n = mijnScanner.nextInt();



            /*if (mijnScanner.hasNextInt()) {
                int leeftijd = mijnScanner.nextInt();
                System.out.println("U heeft " + leeftijd + " jaar ingevoerd.");
            } else {
                System.out.println("Ongeldige invoer. Voer alstublieft een geldig getal in.");
            }*/
        }
    }


