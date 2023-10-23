package Opdracht1;


public class ElectricCar extends Car {
    private int battery = 60;
    private int accelationRate;
    private int slowRate;
   /* public ElectricCar()
    {}
    public ElectricCar(int battery)
    {
        this.battery = battery;
       // System.out.println(battery);

    }

    public int getBattery() {
        return this.battery;
    }*/

    public ElectricCar(String color, int speed) {
        super(color, speed);                              //car constructor aanroepen
    }

    @Override
    public void accelerate(int amount) {
        this.accelationRate = (amount + battery / 100);
        System.out.println("Accelation Rate is   :" + this.accelationRate);

    }

    @Override
    public void slow(int amount) {
        this.slowRate = -(amount + battery / 100);
        System.out.println("Slow rate of the car is  " + this.slowRate);
    }

    @Override
    public void park() {
        System.out.println("Car is parked for charging");
        this.charge(100);
    }

    public void charge(int amount) {
        System.out.println("100% charged");
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Currently Battery  is            :").append(battery);
        String genInfo = super.toString();         //aanroepen Car class toString method
        System.out.println(genInfo);
        String info = sb.toString();               // StringBuffer to string
        return info;
    }
}


