package Oefningen2;

public class Oefning1 {
    public static void main(String[] args) {
        int my_array[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        int length = my_array.length;
        for (int i = 0; i< length ; i++)
        {
            sum = sum+my_array[i];
        }
        System.out.println("Sum of all the elements in an array is " + sum);


    }
}
