package Map;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<>();
        map.put("Alice",25);
        map.put("Bob",30);
        map.put("Charlie",35);
//get the value of the key
        int ageOfAlice = map.get("Alice");
        System.out.println("Leeftijd van Alice :" + ageOfAlice);
//Given key is in the map or not
        boolean containdBob = map.containsKey("Bob");
        System.out.println(containdBob);
        //Size of the map
        int size = map.size();
        System.out.println("Grotte van de Map  " +size);

        //To get all the keys of the Map
        for(String key : map.keySet())
        {
            System.out.println("Keys are " + key);
        }
        // to get all the values in tghe map
        for(int value :map.values())
        {
            System.out.println("Values  " + value);
        }

        map.clear();
        {

        }



    }
}
