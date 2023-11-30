package LinkedList_Oefningen;

import java.util.Iterator;
import java.util.LinkedList;

public class Oefning3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        printList(list);
        printSum(list);
        printAverage(list);
    }

    public static void printList(LinkedList list) {
        Iterator itr = list.iterator();
        System.out.println("List is  :");
        while (itr.hasNext()) {
            System.out.print(itr.next() + "  ");
        }
    }

    public static void printSum(LinkedList list) {
        System.out.println();
        int sumOfNumbers = list.stream().mapToInt(i -> (int) i).reduce(0, (a, b) -> a + b);
        System.out.println("Sumof the list is : " + sumOfNumbers);

    }

    public static void printAverage(LinkedList list) {
        System.out.println();
        double averageOfNumbers = list.stream().mapToInt(i -> (int) i).average().orElse(0.0);

        System.out.println("Average of the list is : " + averageOfNumbers);

    }


}
