import java.util.*;
public class PascalTriangle {

	// public static int fact(int n){
	// 	int fact = 1;
	// 	while(n!=0){
	// 		fact*=n;
	// 		n--;
	// 	}
	// 	return fact;
	// }
	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);

	// 	System.out.println("Enter Number of Rows: ");
	// 	int n = sc.nextInt();

	// 	int numc=1;

	// 	for(int r=0;r<n;r++){
	// 		for(int c=0;c<numc;c++){
	// 			int nCr=fact(r)/(fact(r-c)*fact(c));
	// 			System.out.print(nCr+" ");
				 
	// 		}
	// 		System.out.println();
	// 		numc++;
	// 	}
	// }

	//Optimized

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Rows: ");
		int n = sc.nextInt();

		for(int i=0;i<n;i++){
			int val = 1;  //value of iC0 or iCj
			for(int j=0;j<=i;j++){
				System.out.print(val+" ");
				val=(val*(i-j))/(j+1);  //value of iC(j+1)
			}
			System.out.println();
		}
	}
}
