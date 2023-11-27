package FinalExample2;

public class Main {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("Intec");
        System.out.println("Before the change"+ sb);

        sb.append("Brussel");
        System.out.println("After the change"+sb);
    }
}
