package LinkedList_Oefningen.Oefning2ReverseSentence;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Oefning2 {
    public static void printSentence(LinkedList list)
    {
        list.forEach(i-> System.out.print(i + " "));
        System.out.println();
    }

    public static void printSentenceInReverseOrder(LinkedList list)
    {
        Collections.reverse(list);
        System.out.println("Sentences Reversed");
        list.forEach(i-> System.out.print(i + " "));
    }
    public static void printNumberOfWords(LinkedList list)
    {
        System.out.println();
        long words = list.size();
        System.out.println("Total no of words are  " + words);

    }


}
