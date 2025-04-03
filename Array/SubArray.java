import java.util.Scanner;
public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of values in Array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the Elements of Array: ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        subArray(ar);
    }

    public static void subArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
