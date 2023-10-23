package Opdracht1;

public class mainCarApp {
    public static void main(String[] args) {
        String carbioSunRoofInfo;
        String electricInfo;
        System.out.println("Cabrio Information");
        System.out.println("***************************");
        Cabrio cabrio = new Cabrio("Yellow",180,200);   // Object maakt van Carbrio
        carbioSunRoofInfo = cabrio.toString(); // aanroepen van toString overridden method met cabrio object
        System.out.println(carbioSunRoofInfo );
        cabrio.openRoof();                      // methode in Cabrio sub Klas
        cabrio.accelerate(50);
        cabrio.slow(50);
        cabrio.park();

        System.out.println("***************************");
        System.out.println("Electric Car Information");
        //ElectricCar battery = new ElectricCar(60);
        //System.out.println(battery.getBattery());
        ElectricCar electricCar = new ElectricCar("Groene",180);   // Object maakt van Carbrio

        electricInfo = electricCar.toString();
        System.out.println(electricInfo);
        electricCar.accelerate(50);
        electricCar.slow(50);
        electricCar.park();








    }
}


