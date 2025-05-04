import java.util.*;
public class AlphaDecoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        String s = sc.nextLine();
        encode(s,"");
    }



    static String alpha[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static void aDec(String s, String asf){
        if(s.length()==0){
            System.out.println(asf);
            return;
        }
        
        if(s.charAt(0)=='0'){
            aDec(s.substring(1),asf);
            return;
        }

        if(s.length()>=1){
            char ch = s.charAt(0);
            aDec(s.substring(1),asf+alpha[Integer.parseInt(ch+"")-1]);
        }

        if(s.length()>=2){
            String ss = s.substring(0,2);
            int n = Integer.parseInt(ss);
            if(n<=26){
                aDec(s.substring(2),asf+alpha[n-1]);
            }
        }

    }

    public static void encode(String s,String asf){
        if(s.length()==0){
            System.out.println(asf);
            return;
        }

        if(s.charAt(0)=='0'){
            encode(s.substring(1),asf);
            return;
        }

        char fchar = s.charAt(0);
        int num1 = Integer.parseInt(fchar+"");
        encode(s.substring(1),asf+ (char)('a'+num1-1));

        if(s.length()>1){
            char schar = s.charAt(1);
            int num2 = Integer.parseInt(""+fchar+schar);
            if(num2>=10 && num2<=26){
                encode(s.substring(2),asf+ (char)('a'+num2-1));
            }
        }

    }
}
