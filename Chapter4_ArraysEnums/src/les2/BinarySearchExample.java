package les2;
import java.util.Arrays;
public class BinarySearchExample {
    public static void main(String[] args) {
        int[] intArray = {300,200,100,500,200} ;
        Arrays.sort(intArray);
        int keyElement = 200;
        System.out.println(keyElement + "Found at index"  + Arrays.binarySearch(intArray,keyElement) );

    }
}
