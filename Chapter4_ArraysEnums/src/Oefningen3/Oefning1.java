// Program to convert string into char array
package Oefningen3;

public class Oefning1 {
    public static void main(String[] args) {
        String myString = "Char Array!";
        char myCharArray[] = myString.toCharArray();
        int lengthOfArray = myCharArray.length;
        for(int i = 0; i<lengthOfArray;i++)
        {
            System.out.print(" | " + i + " = " + myCharArray[i] + " | " );
        }
    }
}
