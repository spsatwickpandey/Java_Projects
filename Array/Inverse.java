import java.util.*;

public class Inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int[] res = new int[n];
        int i = 0;
        int j = 0;

        while(i<arr.length){
            if(arr[i]==j){
                res[j] = i;
                i=-1;
                j++;
            }
            i++;
        }


        for(int a=0;a<res.length;a++){
            System.out.print(res[a]+" ");
        }

    }
}
