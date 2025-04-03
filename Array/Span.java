import java.util.*;

public class Span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter values: ");
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int span = span(arr);
        System.out.println("Span: "+span);
    }

    public static int span(int array[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
            else if(array[i]>max){
                max = array[i];
            }
        

        return max-min;
    }
}
