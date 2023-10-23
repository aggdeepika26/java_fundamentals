package Oefningen6;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        HolidayDestination holidayDestination = new HolidayDestination();
        Country[] countryArr = Country.values();

        for(Country element : countryArr)
        {
            System.out.println(element + "   At index  " + element.ordinal());
        }
        System.out.println("Choose country to know the tour price" );
        Scanner myScanner = new Scanner(System.in);
        String country = myScanner.nextLine();
        holidayDestination.countryTourCost(country);






    }
}
