package Oefeningen1;

public class Oefning3 {
    public static void main(String[] args) {
        int[] intArray = {10,11,12,13,14};
        int lenOfArray = intArray.length;
        for(int i = 0 ; i< lenOfArray ; i++)
        {
            if (intArray[i] % 2 == 0)
                System.out.println(intArray[i] + " is even");
            else
                System.out.println(intArray[i] + " is odd");
        }

    }
}
