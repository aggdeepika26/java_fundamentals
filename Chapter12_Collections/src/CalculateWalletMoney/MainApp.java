package CalculateWalletMoney;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        Map<Coin,Integer> wallet = new LinkedHashMap<>();
        wallet.put(Coin.ONE_EURO,2);
        wallet.put(Coin.FIFTY_CENT,3);
        wallet.put(Coin.TEN_CENTS,5);
        wallet.forEach((k,v)->System.out.println(k + ": " + v));
        double sum = wallet.keySet().stream().mapToDouble(coin->wallet.get(coin)* coin.getValue()).sum();
        System.out.println(sum);

        wallet.keySet().stream()
                .sorted(Comparator.comparing(Coin::getValue))
                .forEach(System.out::println);
    }
}
