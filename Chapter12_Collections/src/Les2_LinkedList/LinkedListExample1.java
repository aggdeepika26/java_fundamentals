package Les2_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.stream().forEach(System.out ::println);

        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next() );
        }

    }
}
