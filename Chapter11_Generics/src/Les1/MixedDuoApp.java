package Les1;

public class MixedDuoApp {
    public static void main(String[] args) {
        MixedDuo<String,Integer> mduo = new MixedDuo<>("Dog",20);
        System.out.println(mduo.getObject1());
        System.out.println(mduo.getObject2());
    }
}
