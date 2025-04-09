import java.util.*;
public class Maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row: ");
        int r = sc.nextInt();
        System.out.println("Enter Column: ");
        int c = sc.nextInt();

        ArrayList<String> ans = maze(0,0,r-1,c-1);
        System.out.println(ans);
    }

    public static ArrayList<String> maze(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> blanc = new ArrayList<>();
            blanc.add("");
            return blanc;
        }

        ArrayList<String> myPath = new ArrayList<>();
        if(sr<=dr){
            ArrayList<String> vpath = maze(sr+1,sc,dr,dc);
            for(String path : vpath){
                myPath.add('v'+path);
            }
        }
        if(sc<=dc){
            ArrayList<String> hpath = maze(sr,sc+1,dr,dc);
            for(String path : hpath){
                myPath.add('h'+path);
            }
        }

        return myPath;
    }
}
