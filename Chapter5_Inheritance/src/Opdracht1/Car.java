package Opdracht1;
public class Car {
    private String color ;
    private int speed;
    private int hp;
    private int accelationRate;
    private int slowRate;


    public Car()
    {}
    public Car(String color, int speed, int hp)        //Constructor voor Cabrio en SUV
    {
        this.color = color;
        this.speed = speed;
        this.hp = hp;
    }

    public Car(String color, int speed) {               //Constructor  created for Electric Car
        this.color = color;
        this.speed = speed;

    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void accelerate(int amount)
    {
        this.accelationRate = (amount+hp/100);
        System.out.println("Accelation Rate is   :" + this.accelationRate);


    }
    public void slow(int amount)
    {
        this.slowRate = -(amount+hp/100);
        System.out.println("Slow Rate is        :"   + this.slowRate);
    }
    public void park()
    {
        this.speed = 0;
        System.out.println("Park Safely and easily");
    }

    public int speedLimit()
    {
        return this.speed = 30;
    }

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();
        if(this.getHp() != 0) {
            sb.append("Color               :").append(getColor()).append("\n");
            sb.append("Maximum Speed       :").append(getSpeed()).append("\n");
            sb.append("Maximum Horse Power :").append(getHp()).append("\n");
            sb.append("Maximum Speed Limit when car is on 4X4 :").append(speedLimit()).append("km");
            String info = sb.toString();
            return info;
        }
        else
        {
            sb.append("Color               :").append(getColor()).append("\n");
            sb.append("Maximum Speed       :").append(getSpeed()).append("\n");
            sb.append("Maximum Speed Limit when car is on 4X4 :").append(speedLimit()).append("km");
            String info = sb.toString();
            return info;
        }

    }



}

