package SleepExample;

import Les1.ThreadExample1;

public class MainApp {
    public static void main(String[] args) {
        try
        {
            Thread thread1 = new Thread(new ThreadExample2("+", 100));
            Thread thread2 = new Thread(new ThreadExample2("-", 20));

            System.out.println(thread1.getState());
            System.out.println(thread2.getState());
            thread1.start();
            thread2.start();
            Thread.sleep(2000);
            System.out.println(thread1.getState());
            thread1.interrupt();
            System.out.println(thread1.getState());
            Thread.sleep(500);
            thread1.interrupt();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }


    }
}
