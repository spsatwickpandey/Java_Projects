import java.util.Scanner;

public class Arraydiff{
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
        int borrow = 0;
        int diff;
        while(k>=0){
            int d1 = (i<0) ? 0 : arr1[i];
            int d2 = (j<0) ? 0 : arr2[j];
            
            if(k==i){
                d1 = d1 - borrow;
                diff = d1 - d2; 
                borrow = (diff < 0) ? 1 : 0;
                int digit = diff+borrow*10;
                result[k] = digit;
            }
            else{
                d2 = d2 - borrow;
                diff = d2 - d1; 
                borrow = (diff < 0) ? 1 : 0;
                int digit = diff + borrow * 10;
                result[k] = digit;
            }
            i--;
            j--;
            k--;
        }
        int ans = 0;
        for(int a=result.length-1;a>=0;a--){
            ans += result[a] * (int)Math.pow(10,result.length-a-1);
        }
        System.out.println("Answer: "+ans);

    }
}