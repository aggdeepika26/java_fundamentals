package Les1;

public class DemoMainApp {
    public static void main(String[] args) {
        int n = 10; //no of threads
        for(int i = 0 ; i< n ; i++)
        {
            DemoExtendsThread object = new DemoExtendsThread();
            object.start();
        }
    }
}
