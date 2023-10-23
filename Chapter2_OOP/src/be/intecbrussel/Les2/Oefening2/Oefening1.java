//om te controleren gegeven string is palindrome of niet
package be.intecbrussel.Les2.Oefening2;
import java.util.Scanner;
public class Oefening1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a String to check it is pallindrome or not");
        String str1 = myScanner.nextLine();
        int len = str1.length();
        int last = len-1;
        int mid = (len-1)/2;
        boolean ans = true;
        for(int first = 0; first<mid ;first++)
        {
            if(str1.charAt(first) != str1.charAt(last))
            {
                ans = false;
                break;
            }
            else
            {
                last--;
            }


        }
        if(ans==true)
        {
            System.out.println(str1+" is pallindrome");
        }
        else
        {
            System.out.println(str1+" is not pallindrome");
        }

    }
}
