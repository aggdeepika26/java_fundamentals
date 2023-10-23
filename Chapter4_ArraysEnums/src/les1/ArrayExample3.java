package les1;
import java.util.Scanner;
public class ArrayExample3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] myArr = new int[5] ;
        System.out.println("Enter 5 elements");
        for(int i = 0; i<5;i++)
        {
            myArr[i] = myScanner.nextInt();
        }
        System.out.println("Traversing with For Loop");
        for (int i = 0 ; i<5 ; i++)
        {
            System.out.println(myArr[i]);
        }
        System.out.println("Traversing with For each Loop");
        for(int element : myArr)
        {
            System.out.println(element);
        }
        System.out.println("Traversing with while Loop");
        int length = myArr.length ;
        int index = 0;

        while (index<length)
        {
            System.out.println(myArr[index]);
            index++;
        }



    }
}
