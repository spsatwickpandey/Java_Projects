import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter Target: ");
        int x = sc.nextInt();

        int fi = firstIdx(arr,0,x);
        System.out.println("First Index: "+fi);

        int li = lastIdx(arr,0,x);
        System.out.println("Last Index: "+li);


        int[] ans = allIdx(arr,0,x,0);

        if(ans.length==0){
            System.out.println();
            return;
        }

        for(int k=0;k<ans.length;k++){
            System.out.println(ans[k]);
        }
    }


    public static int firstIdx(int[] arr,int idx,int target){
        if(idx==arr.length){
            return -1;
        }
        int ans = firstIdx(arr,idx+1,target);

        if(arr[idx]==target){
            return idx;
        }
        else{
            return ans;
        }


    }

    public static int lastIdx(int[] arr,int idx,int target){
        if(idx==arr.length){
            return -1;
        }
        
        int res = lastIdx(arr,idx+1,target);

        if(res == -1){
            if(arr[idx]==target){
                return idx;
            }
            else{
                return -1;
            }
        }

        return res;
    }

    public static int[] allIdx(int[] arr,int idx,int target,int fsf){  //fsf-frequency so far
        if(idx==arr.length){
            int[] ans = new int[fsf];
            return ans;
        }
        if(arr[idx]==target){
            int ans[] = allIdx(arr,idx+1,target,fsf+1);
            ans[fsf] = idx;
            return ans;
        }
        else{
            return allIdx(arr,idx+1,target,fsf);
        }

    }
}
