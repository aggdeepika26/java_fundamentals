package Les1;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add(3,"ee");
        list.forEach(name-> System.out.println(name+ " "));
    }
}
