
public class BooleanToString {
    public static void main(String[] args) {
        boolean value = true;

        String output1 = Boolean.toString(value);
        System.out.println("String using toString: "+output1);

        String output2 = String.valueOf(value);
        System.out.println("String using valueOf: "+output2);
    }
}
