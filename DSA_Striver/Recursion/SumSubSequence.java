
import java.util.*;
// print subsequences whose sum is == k;
public class SumSubSequence {

    public static void subs(int i,int[] arr,ArrayList<Integer> lst,int sum,int k){
        if(i==arr.length){
            if(sum==k){ 
                System.out.println(lst);
            }
            return;
        }

        //take
        lst.add(arr[i]);
        sum+=arr[i];
        subs(i+1,arr,lst,sum,k);

        //not take
        lst.remove(lst.size()-1);
        sum-=arr[i];
        subs(i+1,arr,lst,sum,k);
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

        System.out.println("Enter Desired Sum (K): ");
        int k = sc.nextInt();

        ArrayList<Integer> lst = new ArrayList<>();

        subs(0,arr,lst,0,k);

        sc.close();
    }
}


//Print only 1 || first subsequence whose sum is == k : (VVIMP)

// import java.util.*;

// public class Main{

//     public static boolean subs(int i,int[] arr,ArrayList<Integer> lst,int sum,int k){
//         if(i==arr.length){
//             if(sum==k){ 
//                 System.out.println(lst);
//                 return true;
//             }
//             return false;
//         }

//         //take
//         lst.add(arr[i]);
//         sum+=arr[i];
//         if(subs(i+1,arr,lst,sum,k) == true){ 
//             return true;
//         }
        
//         //not take
//         lst.remove(lst.size()-1);
//         sum-=arr[i];
//         if(subs(i+1,arr,lst,sum,k)==true){
//             return true;
//         }
        
//         return false;
//     }

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter n: ");
//         int n = sc.nextInt();

//         System.out.println("Enter Elements: ");
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         System.out.println("Enter Desired Sum (K): ");
//         int k = sc.nextInt();

//         ArrayList<Integer> lst = new ArrayList<>();

//         subs(0,arr,lst,0,k);

//         sc.close();
//     }
// }
