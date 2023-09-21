package be.intecbrussel.les5.Oefeningen4;

public class Oefening1 {
    public static void main(String[] args) {
        System.out.println("The numbers divisible by 7 from 1 to 100 in reverse order are");
        for(int i = 100;i>=1;i--)
        {
            if(i%7 == 0)
                System.out.println(i);
        }
    }
}
