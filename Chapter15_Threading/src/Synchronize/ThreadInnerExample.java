package Synchronize;

public class ThreadInnerExample {
    private int count = 0;
    public int getCount()
    {
        return count;

    }

    public static void main(String[] args) throws InterruptedException{
        ThreadInnerExample threadInnerExample = new ThreadInnerExample();
        InnerThread thread1 = new InnerThread(threadInnerExample);
        InnerThread thread2 = new InnerThread(threadInnerExample);
        thread1.start();
        thread1.join();
        thread2.start();
        System.out.println("Hello......");



    }
    private  static class InnerThread extends  Thread {
        private ThreadInnerExample example;

        public InnerThread(ThreadInnerExample example) {
            this.example = example;
        }

        public void run() {
            try {
                example.incrementCount();
                Thread.sleep(3000);
                System.out.println("Hallo vanaf thread  " + this.getId() + ", count is nv " + example.getCount());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
        public synchronized  void incrementCount()
        {
            count ++;
        }
}

