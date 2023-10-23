package les2;
import java.util.Arrays;
public class FillExample {
    public static void main(String[] args) {
        int[] myArray1 = {20,30,40,50,60};
        Arrays.fill(myArray1,10);
        System.out.println("Array filled with 10" + Arrays.toString(myArray1));

        int[] myArray2 = {20,20,20,20,20,20,20,20};
        Arrays.fill(myArray2,2,6,10);

        System.out.println("Array filled with 10" + Arrays.toString(myArray2));

    }

}
