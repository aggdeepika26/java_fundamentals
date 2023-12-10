package Runnable;

public class MultiThreadingDempApp {
    public static void main(String[] args) {
        {
            int n = 10; //no of threads
            for(int i = 0 ; i< n ; i++)
            {
                Thread object = new Thread(new MultiThreadingDemoImplementsRunnable());
                object.start();
            }
        }
    }
}
