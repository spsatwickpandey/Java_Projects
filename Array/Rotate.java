import java.util.*;
public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Values: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter Number of Rotations: ");
        int k = sc.nextInt();

        rotate(arr,k);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotate(int[] nums,int k){
        if(k>nums.length){
            k=k%nums.length;
        }
        if(k<0){
            k=nums.length+k;
        }
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public static void reverse(int[]  arr,int low,int high){

        while(low<high){
            arr[low]=arr[low]+arr[high];
            arr[high]=arr[low]-arr[high];
            arr[low]=arr[low]-arr[high];

            low++;
            high--;
        }
    }

}
