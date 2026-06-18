
import java.util.*;

public class Subsequence {

    public static void subs(int i,int[] arr,ArrayList<Integer> lst){
        if(i==arr.length){
            System.out.println(lst);
            return;
        }

        //take
        lst.add(arr[i]);
        subs(i+1,arr,lst);

        //not take
        lst.remove(lst.size()-1);
        subs(i+1,arr,lst);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Enter Elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        ArrayList<Integer> lst = new ArrayList<>();

        subs(0,arr,lst);

        sc.close();
    }
}
