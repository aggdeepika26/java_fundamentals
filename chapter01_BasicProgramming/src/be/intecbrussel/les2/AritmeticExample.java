package be.intecbrussel.les2;

public class AritmeticExample {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        int sum = a+b;
        int sub = b-a;
        int mul = a*b;
        int div = a/b;
        int mod = b%a;
        System.out.println("Sum of A and B is " + sum);
        System.out.println("Subtraction of A and B is " + sub);
        System.out.println("Multiplication of A and B is " + mul);
        System.out.println("Division of A and B is " + div);
        System.out.println("Modulus of A and B is " + mod);
        int inc = ++a;
        int dec = --a;
        System.out.println("Sum of A and B is " + sum);
        System.out.println("Increament of A  is " + inc);
        System.out.println("Decreament of A is " + dec);
    }
}