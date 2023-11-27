package Les1;

public class DuoApp {
    public static void main(String[] args) {
        DuoExample<String> duo = new DuoExample<>("Hello","World");
        System.out.println(duo.getS1());
        System.out.println(duo.getS2());
        DuoExample<Integer> duo1 = new DuoExample<>(5,6);
        System.out.println(duo1.getS1());
        System.out.println(duo1.getS2());
    }
}
