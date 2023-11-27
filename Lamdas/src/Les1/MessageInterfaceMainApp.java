package Les1;

public class MessageInterfaceMainApp {
    public static void main(String[] args) {
        MessageInterface ref = (x,y)->
        {
            System.out.println("Hello " + x + y);
            System.out.println("Have a nice day");
        };
        ref.message("World" , '!');
    }
}
