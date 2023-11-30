package Map;

import java.util.TreeMap;

public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<String, Integer> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put("Apple", 25);
        linkedHashMap.put("Banana", 5);
        linkedHashMap.put("Orange", 15);
        //get the value of the key
        int quantityOfApple = linkedHashMap.get("Apple");
        System.out.println("Quantity of apples " + quantityOfApple);
        //Given key is in the map or not
        boolean containsBanana = linkedHashMap.containsKey("Banana");
        System.out.println(containsBanana);

        int size = linkedHashMap.size();
        System.out.println("Grotte van de Map  " + size);

        //To get all the keys of the Map
        for (String key : linkedHashMap.keySet()) {
            System.out.println("Keys are " + key);
        }
        // to get all the values in tghe map
        for (int value : linkedHashMap.values()) {
            System.out.println("Values  " + value);
        }

        linkedHashMap.clear();
        {
            boolean isEmpty = linkedHashMap.isEmpty();
            System.out.println("Is  map leeg " + isEmpty);

        }


    }


}
