package be.intecbrussel.Les3;

public class MathFuncExample2 {
    public static void main(String[] args) {
        int result01 = Math.max(10,9);
        double result02 = Math.max(10.3,9.6);
        long result03 = Math.max(17L,9L);
        float result04 = Math.max(10F,9F);
        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
        System.out.println(result04);
        System.out.println(Math.max(8L,6.5f));
        System.out.println(Math.max(15L,11.5D));

        System.out.println("minimum");
        int result05 = Math.min(10,9);
        double result06 = Math.min(10.3,9.6);
        long result07 = Math.min(17L,9L);
        float result08 = Math.min(10F,9F);
        System.out.println(result05);
        System.out.println(result06);
        System.out.println(result07);
        System.out.println(result08);
        System.out.println(Math.min(8L,16.5f));
        System.out.println(Math.min(15L,19.5D));

        System.out.println("ceil value");

        double result9 = Math.ceil((4));
        System.out.println(result9);
        System.out.println("floor value");
        double result10 = Math.floor((4.8));
        System.out.println(result10);

        System.out.println("random");



    }
}
