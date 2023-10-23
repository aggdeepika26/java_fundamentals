package les2;

public class JoinExample {
    public static void main(String[] args) {
        String[] strArrayToString = {"intec","brussel","is","the","best"};
        String itIsNowAString = String.join(" ",strArrayToString );
        String itIsNowAStringWithHyphen = String.join("- ",strArrayToString );
        System.out.println(itIsNowAString);
        System.out.println(itIsNowAStringWithHyphen);
    }
}
