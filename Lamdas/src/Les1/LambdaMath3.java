package Les1;

public class LambdaMath3 {
    public static void main(String[] args) {
        print((a,b) -> a+b , "ADD");
        print((a,b) -> a-b , "SUB");
        print((a,b) -> a*b , "MUL");
        print((a,b) -> a/b , "DIV");

    }
    static void print (Math math ,String op)
    {
        switch (op.toUpperCase())
        {
            case "ADD":
            {
                System.out.println("The sum of a and b is " + math.operation(40,20));
                break;
            }
            case "SUB":
            {
                System.out.println("The subtraction of a and b is " + math.operation(40,20));
                break;
            }
            case "MUL":
            {
                System.out.println("The multiplication of a and b is " + math.operation(40,20));
                break;
            }
            case "DIV":
            {
                System.out.println("The division of a and b is " + math.operation(40,20));
                break;
            }
            default:
                throw new AssertionError();


        }
    }
}

