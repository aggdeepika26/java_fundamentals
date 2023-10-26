package Oefning2_Switch;

public class Car implements Switch1, Motor {
    private boolean switchOnOff;
    public  Car(boolean switchOnOff)
    {
        this.switchOnOff = switchOnOff;
    }

    public boolean getSwitchOnOff() {
        return switchOnOff;
    }

    @Override
    public void toggleSwitch() {
        this.switchOnOff = getSwitchOnOff();
        if (this.switchOnOff) {
            System.out.println("Switch is on");
        } else {
            System.out.println("Switch is off");
        }
    }

    @Override
    public void gas()
    {
        if(this.switchOnOff)
        {
            System.out.println("Gas kan Geven");
        }
        else
        {
            System.out.println("Gas kan niet geven");
        }

    }
}
