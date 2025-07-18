import java.util.LinkedHashMap;
import java.util.Scanner;

public class RFNRC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String s = sc.nextLine();

        System.out.println(firstNonRepeatingCharacter(s));

    }

    public static String firstNonRepeatingCharacter(String str){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:map.keySet()){
            if(map.get(c)==1){
                return ""+c;
            }
        }
        return "No Non Repeating Characters Found!!";
    } 
}
