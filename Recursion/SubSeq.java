import java.util.Scanner;

public class SubSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        printss(s,"");
    }
    public static void printss(String qsf,String asf){
        if(qsf.length()==0){
            System.out.println(asf);
            return;
        }
        char ch = qsf.charAt(0);
        String ss = qsf.substring(1);
        printss(ss,asf+ch);
        printss(ss,asf);

    }
}
