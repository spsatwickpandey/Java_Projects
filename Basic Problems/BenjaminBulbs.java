import java.util.*;
public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Bulbs: ");
        int n = sc.nextInt();

        System.out.println("Enter Number of People: ");
        int p = sc.nextInt();
        
        System.out.println("Enter Number of bulbs whose status you need to know: ");
        int b = sc.nextInt();



        for(int i=1;i<=b;i++){
            boolean status = false;
            System.out.println("Enter Bulb "+i+":");
            int bulb = sc.nextInt();
            for(int a=1;a<=p;a++){
                if(bulb%a==0 && status==false){
                    status=true;
                }
                else if(bulb%a==0 && status==true){
                    status=false;
                }
            }
            if(status==true){
                System.out.println("Bulb is Switched On");
            }
            else{
                System.out.println("Bulb is Switched off");
            }
        }
    }
}
