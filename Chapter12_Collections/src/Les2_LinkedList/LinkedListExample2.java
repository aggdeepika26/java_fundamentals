package Les2_LinkedList;

import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("E");
        list.add("F");
        list.add(3,"D");
        list.forEach(i-> System.out.print(i + "  "));
    }
}
