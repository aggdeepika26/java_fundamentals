package Les1;

public class MInterfaceApp {
    public static void main(String[] args) {
        MInterface ref = (str) -> {
            String result = "";
            for(int i = str.length()-1 ; i >=0 ;i--)
            {
                result+= str.charAt(i);

            }
            return result;
        };
        System.out.println("Lambda reversed " + ref.reverse("Lambda"));
    }
}
