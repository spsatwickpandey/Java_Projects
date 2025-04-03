// import java.util.*;
// public class Fibonacci {
//     public static void main(String[] args) {
//         int a=0,b=1,temp,sum=0;
//         int arr[];
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Number of Terms: ");
//         int n = sc.nextInt();

//         arr = new int[n];
//         arr[0] = a;
//         arr[1] = b;

//         System.out.print("Fibonacci Series: "+a+", "+b);
//         for(int i=2;i<n;i++){
//             temp=a+b;
//             arr[i]=temp;
//             System.out.print(", "+temp);
//             a=b;
//             b=temp;
//         }
//         System.out.println();
        
//         for(int j=0;j<n;j+=2){
//             sum+=arr[j];
//         }
//         System.out.println("Sum of Even Index: "+sum);
//     }
// }

//above code is using array indexing

// import java.util.*;
// public class Fibonacci
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number till where you want your series");
//         int n = sc.nextInt();
//         int n1 = 0 , n2 = 1 , s=0 ;
//         System.out.print(n1+" "+n2);
//         for(int i = 2 ; i<n;i++)
//         {
//             n2=n1+n2;
//             System.out.print(" "+n2);
//             if(i%2==0)
//             {
//                 s=s+n2;
//             }
//             n1=n2-n1;
//         }
//         System.out.println();
//         System.out.println("Sum of even placed number = "+s);

//     }
// }



import java.util.*;
public class Fibonacci
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you want your series");
        int n = sc.nextInt();
        int a = 0 , b = 1 , c=0, sum=0 ;

        for(int i =0 ; i<n ; i++)
        {
            System.out.print(a+" ");
            if(i%2==0)
            {
                sum=sum+a;
            }

            c=a+b;
            a=b;
            b=c;

        }
        System.out.println();
        System.out.println("Sum of even placed number = "+sum);

    }
}
