package be.intecbrussel.Les1;

public class stringExample {
    public static void main(String[] args) {

        String name = "JAVA";
        System.out.println(name.toLowerCase());
        String name1 = "java";
        System.out.println(name.toLowerCase());
        String name2 = "JAVA";
        System.out.println(name.length());
        String name3 = "JAVA";
        System.out.println(name.isBlank());
        String name4 = "JAVA";
        System.out.println(name.replace("AVA","ava"));

        String name5 = "   JAVA";
        System.out.println(name5.strip());
        String name6 = "  JAVA";
        System.out.println(name6.stripLeading());
        String name7 = "JAVA  ";
        System.out.println(name5.stripTrailing());
        String name8 = "hello world";
        System.out.println(name8.indexOf("world"));
        String name9 = "hello world";
        System.out.println(name8.contains("World"));
        String name10 = "hello world";
        System.out.println(name8.substring(3,8));

    }
}
