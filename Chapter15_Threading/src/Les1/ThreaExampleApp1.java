package Les1;

public class ThreaExampleApp1 {
    public static void main(String[] args) {
        ThreadExample1 thread1 = new ThreadExample1("+");
        ThreadExample1 thread2 = new ThreadExample1("-");
        System.out.println(thread1.getState());
        thread1.start();
        thread2.start();
        System.out.println(thread2.getState());
    }
}
