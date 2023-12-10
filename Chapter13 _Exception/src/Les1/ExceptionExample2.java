package Les1;

public class ExceptionExample2 {
    public static void main(String[] args) {
        int a ;
        try
        {
            a = Integer.parseInt("Hello");
            System.out.println(a);
        }
        catch(NumberFormatException e)
        {
           // System.out.println("you have provided string instead of int" );
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Exception"  + e);
        }

    }
}
