package Oefning3_OpenDoor;

import Oefning2_Switch.Motor;
import Oefning2_Switch.Switch1;


public interface Vehicle extends Switch1 , Motor {


void openDoor(int door);

void closeDoor(int door);




}
