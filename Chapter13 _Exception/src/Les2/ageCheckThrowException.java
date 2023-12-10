package Les2;

public class ageCheckThrowException {
    public static void main(String[] args) {
        ageCheck(20);
    }

    public static void ageCheck(Integer num) throws  ArithmeticException ,NumberFormatException{
        if(num<18)
        {
            throw new ArithmeticException("U mag niet stemmen");
        }
        else
        {
            System.out.println("u kunt stemmen");
        }
    }

}
