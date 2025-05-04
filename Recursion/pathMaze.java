import java.util.*;
public class pathMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int r = sc.nextInt();
        System.out.println("Enter Column: ");
        int c = sc.nextInt();

        path(0,0,r-1,c-1,"");

    }
    public static void path(int sr,int sc,int dr,int dc,String asf){
        if(sr==dr && sc==dc){
            System.out.println(asf);
            return;
        }

        for(int jump=1; sr+jump<=dr;jump++){              //Horizontal
            path(sr+jump,sc,dr,dc,asf+"h"+jump);
        }

        for(int jump=1; sc+jump<=dr;jump++){             //Vertical
            path(sr,sc+jump,dr,dc,asf+"v"+jump);
        }

        for(int jump=1; sr+jump<=dr && sc+jump<=dc;jump++){   //Diagonal
            path(sr+jump,sc+jump,dr,dc,asf+"d"+jump);
        }
    }
}
