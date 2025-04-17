import java.util.*;
public class Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Stairs: ");
        int n = sc.nextInt();

        ArrayList<String> ans = stair(n);
        System.out.println(ans);
    }
    public static ArrayList<String> stair(int n){
        if(n==0){
            ArrayList<String> blanc = new ArrayList<>();
            blanc.add("");
            return blanc;
        }
        ArrayList<String> ans = new ArrayList<>();

        for(int i=1;i<=n;i++){
            ArrayList<String> ret = stair(n-i);
            for(String str : ret){
                ans.add(i+str);
            }
        }
        

        return ans;
    } 
}
