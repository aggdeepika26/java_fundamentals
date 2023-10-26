package Oefning1_Lock;

public class Chest implements Lock
{
    public void lock()
    {
        System.out.println("Method 1 of interface Lock");
    }


    public void unlock() {
        System.out.println("Method 2 of Interface Lock");
    }
}
