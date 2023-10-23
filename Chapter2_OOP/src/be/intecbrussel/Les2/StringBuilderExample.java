package be.intecbrussel.Les2;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str = new  StringBuilder();
        str.append("hello world");
        System.out.println(str);
        StringBuilder str2 = new StringBuilder("walter,mike");
        str2.insert(6,", Edwin");
        System.out.println(str.reverse());


    }

}
