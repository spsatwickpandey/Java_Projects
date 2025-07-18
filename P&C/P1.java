import java.util.*;
public class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of boxes: ");
        int b = sc.nextInt();
        System.out.println("Enter number of objects: ");
        int o = sc.nextInt();
        int[] boxes = new int[b];
        permutate(boxes,1,o);

    }
    public static void permutate(int[] boxes,int co,int to){
        if(co>to){
            for(int o:boxes){
                System.out.print(o);
            }
            System.out.println();
            return;
        }
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]==0){  //empty box
                boxes[i]=co;  //place current object
                permutate(boxes,co+1,to);  
                boxes[i]=0;   //unplace object
            }
        }
    }
}