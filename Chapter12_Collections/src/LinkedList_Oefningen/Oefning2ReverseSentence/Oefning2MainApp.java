package LinkedList_Oefningen.Oefning2ReverseSentence;

import java.util.LinkedList;

public class Oefning2MainApp {
    public static void main(String[] args) {
        LinkedList<String> sentences = new LinkedList<>();
        sentences.add("Hello!");
        sentences.add("How are you");

        Oefning2.printSentence(sentences);
        Oefning2.printSentenceInReverseOrder(sentences);
        Oefning2.printNumberOfWords(sentences);

    }

}
