
package Oefningen2;

public class Oefening2 {
    public static void main(String[] args) {
        String str = "Hello World";
        char myCharArray[] = str.toCharArray();
        int length = myCharArray.length;
        for(int i = 0; i<length;i++)
        {
            System.out.print(myCharArray[i] + " ");
        }
    }
}
