package Oefning3_OpenDoor;

import org.w3c.dom.ls.LSOutput;

public class CarDoors implements Vehicle {
    int doors = 5;
    int openDoor;

    @Override
    public void openDoor(int openDoor) {
        this.openDoor = openDoor;
        if(this.openDoor<=doors)
        {
            gas();
        }


    }

    @Override
    public void closeDoor(int openDoor)
    {
        System.out.println(this.openDoor+ " door is opened.Kindly close all the doors");

    }

    @Override
    public void gas() {
        if (this.openDoor!=0)
        {

            System.out.println("Car can not start");
            closeDoor(this.openDoor);

        }
        else
        {
           this.toggleSwitch();
        }




    }

    @Override
    public void toggleSwitch() {
        System.out.println("Happy journey");
    }
}
