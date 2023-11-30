package LinkedList_Oefningen;

import java.util.ArrayList;
import java.util.LinkedList;

public class Oefning1ArrayListToLinkedList
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        LinkedList<String> linkedList = new LinkedList<>(list);
        linkedList.forEach(System.out::println);

    }



}
