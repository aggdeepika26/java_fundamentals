package Example2;

public class MainApp {
    public static void main(String[] args) {
        Multiplier multiNumbers = new Multiplier();
        int result1 = multiNumbers.multiplyNumbers(2,5);
        float result2 = multiNumbers.multiplyNumbers(2,5,10);
        System.out.println(result1);
        System.out.println(result2);
    }
}
