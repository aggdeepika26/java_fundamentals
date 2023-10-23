package les2;
import java.util.Arrays;
public class CopyOfMethode {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3};
        System.out.println("Original Array");
        for (int index = 0; index < originalArray.length; index++)
        {
            System.out.println(originalArray[index]);
        }
        System.out.println("New Array");
        int[] newArray = Arrays.copyOf(originalArray,5);
        newArray[3] = 11;
        newArray[4] = 13;
        for( int i = 0; i< newArray.length;i++)
        {
            System.out.println(newArray[i]);
        }
    }
}
