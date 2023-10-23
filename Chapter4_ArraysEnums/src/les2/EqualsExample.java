package les2;
import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {
        int[] array01 = {1,2,3,4};
        int[] array02 = {1,2,3,4};
        int[] array03 = {4,3,2,1};
        int[] array04 = {1,2,3,4,5};
        long[] array05 = {1,2,3,4};
        System.out.println(Arrays.equals(array01,array02));
        System.out.println(Arrays.equals(array01,array03));
        System.out.println(Arrays.equals(array01,array04));



    }


}
