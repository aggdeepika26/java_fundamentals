package be.intecbrussel.les5;

public class WhileDoExample3 {
    public static void main(String[] args) {
        boolean hungry = true;
        int count = 0;
        while(hungry == true)
        {
            count++;
            System.out.println("Bake pancake"+count);
            System.out.println("Eat pancake"+count);
            if (count == 4)
            {
                hungry = false;
            }
        }



    }
}
