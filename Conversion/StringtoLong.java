public class StringtoLong {
    public static void main(String[] args) {
        String str = "209109";

        long varLong = Long.parseLong(str);
        System.out.println("Long = "+varLong);

        long varLong1 = Long.valueOf(str);
        System.out.println("Long = "+varLong);
    }
}
