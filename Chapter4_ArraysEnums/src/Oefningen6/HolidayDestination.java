package Oefningen6;

public class HolidayDestination {
    private String city;
    private double cost;
    public void countryTourCost(String city)
    {
        this.city = city.toUpperCase();
        switch(this.city)
        {
            case "BELGIUM" :
            {
                System.out.println("Tour cost 5000 euro");
                break;
            }
            case "CANADA" :
            {
                System.out.println("Tour cost 15000 euro");
                break;
            }
            case "AUSTRIA" :
            {
                System.out.println("Tour cost 6000 euro");
                break;
            }
            case "INDIA" :
            {
                System.out.println("Tour cost 10000 euro");
                break;
            }
            case "FRANCE" :
            {
            System.out.println("Tour cost 5000 euro");
            break;
            }
            case "GERMANY" :
            {
            System.out.println("Tour cost 5000 euro");
            break;
            }



        }




    }
}
