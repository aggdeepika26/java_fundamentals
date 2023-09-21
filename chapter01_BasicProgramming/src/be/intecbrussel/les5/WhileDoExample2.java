package be.intecbrussel.les5;

public class WhileDoExample2 {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while(x<=10)
        {
            sum = sum+x;
            x++;
        }
        System.out.println("Optelling van 1 tot 10 is"+sum);
    }
}
