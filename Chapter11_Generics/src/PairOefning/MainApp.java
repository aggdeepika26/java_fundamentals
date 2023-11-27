package PairOefning;

import org.w3c.dom.ls.LSOutput;

public class MainApp {
    public static void main(String[] args) {
        Pair<Integer> obj1 = new Pair<>(2,3);
        Pair<String> obj2 = new Pair<>("AA","BB");
        System.out.println("Integer Pair");
        System.out.println(obj1);
        System.out.println("String Pair");
        System.out.println(obj2);
    }

}
