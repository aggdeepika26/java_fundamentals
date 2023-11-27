package Oefning3;

public class MainFinalMethod {
    public static void main(String[] args) {
        CircumferenceFinalSub circumferenceWithFinal = new CircumferenceFinalSub();
        System.out.println("Circumference of Sun is "+circumferenceWithFinal.sunCircumference()+ "  miles");
        System.out.println("Circumference of Earth is "+circumferenceWithFinal.earthCircumference() + "miles");
        System.out.println("Circumference of Mercury is "+circumferenceWithFinal.mercuryCircumference() + "km");


    }
}
