package Les1;

public class LambdaSumApp {
    public static void main(String[] args)
    {
        LambdaSum result = (int x, int y) -> {return x + y;};

        System.out.println(result.sum(12,3));
    }
}
