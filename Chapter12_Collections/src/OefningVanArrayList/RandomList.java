package OefningVanArrayList;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RandomList {
    public static void main(String[] args) {
        Random randomNo = new Random();
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        for (int i=1;i<=10;i++)
        {
            int randomInt = randomNo.nextInt();
            randomList.add(randomInt);
        }

        List<Integer> sortedList = randomList.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
