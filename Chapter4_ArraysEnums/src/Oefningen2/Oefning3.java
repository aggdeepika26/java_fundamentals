package Oefningen2;

public class Oefning3 {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        float sum = 0.0F;
        float mid = 0.0f;
        int lengthOfArray = numbers.length;
        for(int i = 0; i< lengthOfArray ;i++)
        {
            sum = sum+numbers[i];
        }
        mid = sum/lengthOfArray;
        System.out.println(Math.floor(mid));

    }
}
