package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String ,Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple",25);
        treeMap.put("Banana",30);
        treeMap.put("Orange",35);
        //get the value of the key
        int quantityOfApple = treeMap.get("Apple");
        System.out.println("Quantity of apples " + quantityOfApple);
        //Given key is in the map or not
        boolean containsBanana = treeMap.containsKey("Banana");
        System.out.println(containsBanana);

        int size = treeMap.size();
        System.out.println("Grotte van de Map  " +size);

        //To get all the keys of the Map
        for(String key : treeMap.keySet())
        {
            System.out.println("Keys are " + key);
        }
        // to get all the values in tghe map
        for(int value :treeMap.values())
        {
            System.out.println("Values  " + value);
        }

        treeMap.clear();
        {
            boolean isEmpty = treeMap.isEmpty();
            System.out.println("Is tree map leeg " + isEmpty);

        }





    }
}
