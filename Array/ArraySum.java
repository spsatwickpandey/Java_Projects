import java.util.*;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter size of array 1: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter elements in array 1: ");
        for(int a=0;a<n1;a++){
            arr1[a]=sc.nextInt();
        }

        System.out.println("Enter size of array 2: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter elements in array 2: ");
        for(int b=0;b<n2;b++){
            arr2[b]=sc.nextInt(); 
        }

        int i = n1-1;
        int j = n2-1;
        int k = (i>j)? i:j;
        int result[] = new int[k+1];
        int carry=0;
        int sum;
        while(i>=0 || j>=0){
            int d1 = (i<0) ? 0:arr1[i];
            int d2 = (j<0) ? 0:arr2[j]; 
            sum = d1 + d2 +carry;
            int digit = sum % 10;
            carry = sum / 10;
            result[k]=digit;
            i--;
            j--;
            k--;
        }
        if(carry!=0){
            System.out.print(carry);
        }
        for(int val:result){
            System.out.print(val);
        }
    }
}
