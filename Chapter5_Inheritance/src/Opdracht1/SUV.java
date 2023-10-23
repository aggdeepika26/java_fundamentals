package Opdracht1;

import javax.swing.*;

public class SUV extends Car{
    private boolean bullbar = true;
    private boolean isAWDOn;
    private int accelationRate;
    public SUV(String color, int speed, int hp,boolean isAWDOn) {
        super(color, speed, hp);//car constructor aanroepen
        this.isAWDOn = isAWDOn;
    }

    public boolean isBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;

    }
    public void allWheelDrive(boolean aWD )
    {
        if(aWD = true)
        {
            System.out.println("Works on all four wheels");
        }
    }

    @Override
    public void accelerate(int amount) {
        if (isAWDOn == true)
        {
            super.setSpeed(30);
        }
        else
        {
            accelationRate = (amount+super.getHp()/100);
            System.out.println("Accelation Rate is   :" +this.accelationRate );


        }

    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("            :").append(isSunroof());
        String genInfo = super.toString();         //aanroepen Car class toString method
        System.out.println(genInfo);
        String info = sb.toString();               // StringBuffer to string
        return info;

    }
}
