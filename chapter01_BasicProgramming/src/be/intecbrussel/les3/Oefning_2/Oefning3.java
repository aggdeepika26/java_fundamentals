package be.intecbrussel.les3.Oefning_2;

public class Oefning3 {
    public static void main(String[] args) {
        byte aNum = 10;
        int bNum = 5;
        long cNum = 5;
        boolean equal = (bNum==cNum && bNum < aNum);
        boolean greater = (aNum > bNum);
        boolean notEqual = (bNum != cNum);
        System.out.println("bNum is equal to cNum but bNum is less than aNum " + equal );
        System.out.println("aNum is greater than bNum " + greater );
        System.out.println("bNum is not equal to cNum  " + notEqual);

    }
}
