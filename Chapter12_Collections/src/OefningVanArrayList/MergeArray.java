package OefningVanArrayList;

import java.util.ArrayList;

public class MergeArray {
    public static void main(String[] args) {
        ArrayList<String> list1 =new ArrayList<String>();
        list1.add("AA");
        list1.add("BB");
        list1.add("CC");
        ArrayList<String> list2 =new ArrayList<String>();
        list1.add("DD");
        list1.add("EE");
        list1.add("FF");
        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("Merged List Is : " + list3);



    }
}
