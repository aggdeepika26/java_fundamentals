package les3;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String>  v = new Vector<>();
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        Iterator itr = v.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
