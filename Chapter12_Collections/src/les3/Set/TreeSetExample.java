package les3.Set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(7);
        set.add(2);
        set.add(8);
        set.add(3);
        System.out.println("Tree Set " +set);
        Integer firstElement = set.first();
        Integer lastElement = set.last();
        System.out.println("First Element " +firstElement);
        System.out.println("Last Element  " +lastElement);

        Integer higherValue = set.higher(5);
        System.out.println("Higher no than 5  " +higherValue);

        Integer lowerValue = set.lower(5);
        System.out.println("Higher no than 5  " +lowerValue);
        //Subset maken
        TreeSet<Integer> subset = (TreeSet<Integer>)set.subSet(3,8);
        System.out.println("Descending tree set " + subset);

     //Descending set
        TreeSet<Integer> descendingSet  = (TreeSet<Integer>)set.descendingSet();
        System.out.println("Descending tree set " + descendingSet);

        //To chck set is empty
        set.clear();
        boolean isEmpty =set.isEmpty();
        System.out.println("Is tree set empty  " + isEmpty);


    }

}
