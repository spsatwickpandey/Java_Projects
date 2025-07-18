import java.util.*;
public class Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[] arr = new int[n];
        comb(arr,r,n,0);
    }
    public static void comb(int[] arr,int r,int n,int idx){
        if(r==0){
            for(int o:arr){
                System.out.print(o);
            }
            System.out.println();
        }
        for(int i=idx;i<n;i++){
            if(arr[i]==0){
                arr[i]=1;
                comb(arr,r-1,n,i+1);
                arr[i]=0;
            }
        }
    }

}
