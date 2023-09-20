package be.intecbrussel.les3.Oefning_2;

public class Oefning4 {
    public static void main(String[] args) {

        long shortNum = 101;
        double floatNum = 32968.99F;
        boolean booVar = true; //wij kunnen niet een aritmetic assignment operatie op boolean variabel gebruiken
        shortNum -= floatNum;
        System.out.println(shortNum);
        System.out.println(floatNum -= shortNum);
      //  shortNum *= floatNum;
      //  System.out.println(shortNum);
      /*  floatNum /= shortNum;
        System.out.println(floatNum);
        System.out.println(floatNum += shortNum);*/






        System.out.println(shortNum += floatNum);

    }
}
