package Les2;

import java.util.Scanner;

public class numberFormatException {
    public static void main(String[] args) {
        String sleeftijd;
        int iLeeftijd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Joiuw leeftijd");
        sleeftijd = scanner.nextLine();
        try
        {
            iLeeftijd = Integer.parseInt(sleeftijd);
            System.out.println("jouw leeftijd " + iLeeftijd);

        }
        catch(NumberFormatException e)
        {
            System.out.println("Error geen numerieke waarde");
        }
    }
}
