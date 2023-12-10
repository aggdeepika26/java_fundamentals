package Les1;

public class ExceptionExample1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;
        try
        {
            c= a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("you cannot divide by 0");
        }
        finally
        {
            System.out.println("Code werkt");

        }
        System.out.println("Good");
    }
}
