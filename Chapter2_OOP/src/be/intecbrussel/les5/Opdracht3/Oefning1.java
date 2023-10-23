package be.intecbrussel.les5.Opdracht3;
import java.util.Scanner;
public class Oefning1
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your user name please");
        String userName = myScanner.next().toLowerCase();

        boolean checkNaam = (userName.contains("gonilla") || userName.contains("gori") || userName.contains("harambe"));

        if (checkNaam == true) {
            System.out.println("Oh sorry you cannot keep user name that has gonilla gori Harambe ");
            System.out.println("Try Again you have 3 more chances otherwise you will be banned");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Enter your user name please");
                userName = myScanner.next().toLowerCase();
                checkNaam = (userName.contains("gonilla") || userName.contains("gori") || userName.contains("harambe"));
                if (checkNaam == true) {

                    System.out.println("Oh sorry you cannot keep user name that has gonilla gori harambe ");
                    System.out.println(3 - i + "Chance left");
                    if (i == 3) {
                        System.out.println("Sorry you are banned");
                        break;
                    }
                    System.out.println("Try Again");
                    continue;
                } else {
                    System.out.println("User Name is accepted");
                    System.out.println("Welcome to World Of PeaceCraft");
                    break;
                }
            }
        }
        else
        {
            System.out.println("Welcome to World Of PeaceCraft");
        }

    }
}
