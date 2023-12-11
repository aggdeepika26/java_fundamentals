package DaemonExample;

public class ThreadColorApp {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()-> print(ThreadColors.ANSI_BLUE + "1", 100));
        Thread thread2 = new Thread(()-> print(ThreadColors.ANSI_GREEN + "2", 100));
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
        //om aantal beschikbaar cores op de vragen
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    private static  void print(String text, int count)
    {
        for(int j = 0 ; j<count ; j++)
        {
            System.out.print(text);
            Thread.yield();
        }
    }
}
