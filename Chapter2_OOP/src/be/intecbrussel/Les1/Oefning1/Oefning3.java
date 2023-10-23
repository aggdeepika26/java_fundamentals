package be.intecbrussel.Les1.Oefning1;

public class Oefning3 {
    public static void main(String[] args) {
        String str =  "hello world";
        int len = str.length();
        System.out.println(len);

        String str1 = "";
        for(int i = 0 ; i< len ; i++)
        {
            if(i%2 == 0)
            {
                str1 = str1+Character.toUpperCase(str.charAt(i));

            }
            else
                str1 = str1+str.charAt(i);

        }
        System.out.println(str1);

    }
}
