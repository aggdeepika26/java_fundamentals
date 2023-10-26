package Oefning1_Lock;

public class MainInterfaceApp {
    public static void main(String[] args) {

        //Object with Chest Class
        Chest obj01 = new Chest();
        obj01.lock();
        obj01.unlock();
        System.out.println();
        //Object with Lock interface
        Lock obj02 = new Chest();
        obj02.lock();
        obj02.unlock();




    }


}
