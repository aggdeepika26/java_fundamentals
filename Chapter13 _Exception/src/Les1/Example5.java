package Les1;

public class Example5 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("123");
            System.out.println(num);
            try {
                int result = 5 / 0;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("You cannot divide by 0");
            }
        } catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
