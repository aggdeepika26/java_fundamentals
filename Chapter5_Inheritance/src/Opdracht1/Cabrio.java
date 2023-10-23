package Opdracht1;


public class Cabrio extends Car {
    public Cabrio(String color, int speed, int hp) {
        super(color, speed, hp);                              //car constructor aanroepen
    }


    private boolean sunroof = true;

    public boolean isSunroof() {
        return sunroof;
    }

    public void openRoof() {
        System.out.println("Adjustable roof      :   Yes");
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Sunroof             :").append(isSunroof());
        String genInfo = super.toString();         //aanroepen Car class toString method
        System.out.println(genInfo);
        String info = sb.toString();               // StringBuffer to string
        return info;
    }
}


