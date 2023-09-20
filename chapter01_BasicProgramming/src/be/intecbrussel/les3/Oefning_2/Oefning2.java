package be.intecbrussel.les3.Oefning_2;

public class Oefning2 {
    public static void main(String[] args) {
        boolean bool01 = true;
        boolean bool02 = false;
        boolean andOp = (bool01 && bool02);
        boolean orOp = (bool01 || bool02);
        boolean notOp = !(bool01 && bool02);
        System.out.println("Uitkomst voor and operator is" + andOp);
        System.out.println("Uitkomst voor or operator is" + orOp);
        System.out.println("Uitkomst voor not operator is" + notOp);
    }
}
