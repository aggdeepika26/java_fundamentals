package Oefning4;

import Example4.Child;

public class MainApp {
    public static void main(String[] args) {


      //Upcasting
        Vehicle vehicle1 = new TwoWheeler();
        vehicle1.typeOfVehicle = "Two Wheeler";
        System.out.println(vehicle1.typeOfVehicle);
        vehicle1.hornSound();
        System.out.println();
        System.out.println("*********************");

        Vehicle vehicle2  = new FourWheeler();
        vehicle2.typeOfVehicle = "Four Wheeler";
        System.out.println(vehicle2.typeOfVehicle);
        vehicle2.hornSound();
        System.out.println();
        System.out.println("*********************");

        Vehicle vehicle3 = new Bicycle();
        vehicle3.typeOfVehicle = "bicycle";
        System.out.println(vehicle3.typeOfVehicle);
        vehicle3.hornSound();

        //Downcasting
        System.out.println();
        System.out.println("DownCasting");
        System.out.println("************************");


        TwoWheeler twoWheeler = (TwoWheeler)vehicle1 ;
        System.out.println(twoWheeler.typeOfVehicle );
        twoWheeler.hornSound();

        System.out.println();
        FourWheeler fourWheeler = (FourWheeler)vehicle2 ;
        System.out.println(twoWheeler.typeOfVehicle );
        twoWheeler.hornSound();

        System.out.println();
        Bicycle bicycle = (Bicycle) vehicle3 ;
        System.out.println(bicycle.typeOfVehicle );
        bicycle.hornSound();












    }
}
