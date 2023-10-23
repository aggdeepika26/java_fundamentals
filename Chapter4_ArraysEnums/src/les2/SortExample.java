package les2;
import java.util.Arrays;
public class SortExample {
    public static void main(String[] args) {
        int[] myArr = {10,-20,60,-30,1,67,43};
        Arrays.sort(myArr);
        for(int num : myArr)
        {
            System.out.println(num);
        }


    }
}
