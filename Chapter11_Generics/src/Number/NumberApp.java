package Number;

public class NumberApp {
    public static void main(String[] args) {
        NumberDuo<Integer> obj = new NumberDuo<>(2,5);
        NumberDuo<Double> obj1 = new NumberDuo<>(2.5,5.9);
       // NumberDuo<Number> obj2= new NumberDuo<>(2,5);

        System.out.println(obj.sum());
        System.out.println(obj1.sum());
       // System.out.println(obj2.sum());
    }
}
