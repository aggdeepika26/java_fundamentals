package Les1;

public class ExceptionExample3 {
    public static void main(String[] args) {
        String[] month = {"January","February","March","April"};
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(month[i] + " ");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(" ");
        }
    }
}
