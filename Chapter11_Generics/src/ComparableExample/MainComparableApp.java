package ComparableExample;

public class MainComparableApp {
    public static void main(String[] args) {
        ComparableDuo<Integer> d1  = new ComparableDuo<>(3,5);
        ComparableDuo<Double> d2 = new ComparableDuo<>(3.5,5.7);
        System.out.println(d1.getHighest());
        System.out.println(d2.getLowest());
        ComparableDuo<String> d3  = new ComparableDuo<>("Mert", "Yigit");
        System.out.println(d3.getLowest());
    }
}
