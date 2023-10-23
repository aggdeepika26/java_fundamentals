package les2;

public class ToCharArrayExample {
    public static void main(String[] args) {
        String stringToChar = "Hello World";
        char[] charArray = stringToChar.toCharArray();
        for (char ch : charArray)
        {
            System.out.println(ch);
        }
    }
}
