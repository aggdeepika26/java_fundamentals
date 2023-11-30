package Les1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");

    Iterator itr = list.iterator();

            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }

}}
