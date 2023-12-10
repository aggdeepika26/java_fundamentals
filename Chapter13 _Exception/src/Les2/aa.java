package Les2;

public class aa {
    public static void main(String[] args) {
        ageCheck();
    }

    public static void ageCheck(Integer num)
    {
        //throws  ArithmeticException ,NumberFormatException{
        if(num<18)
        {
            System.out.println("u kan niet");
            //throw new ArithmeticException("U mag niet stemmen");
        }
        else
        {
            System.out.println("u kunt stemmen");
        }
    }

}


