import java.util.*;
public class InputAll {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String s = Sc.nextLine();//Sentence
        
        
        System.out.println("Enter Age: ");
        int x = Sc.nextInt();//Integer
        

        System.out.println("Enter Height: ");
        float f = Sc.nextFloat();//Float
        

        System.out.println("Enter Character: ");
        char ch = Sc.next().charAt(0);
        
        System.out.println("You Entered: ");
        System.out.println(s);
        System.out.println(x);
        System.out.println(f);
        System.out.println(ch);
        Sc.close(); 

        //It seems like you're encountering an issue with mixing Scanner methods in Java. When you use sc.next() followed by sc.nextLine(),
        // it can cause unexpected behavior because next() does not consume the newline character, leaving it in the input buffer.
        // When you then call nextLine(), it consumes the leftover newline character, resulting in an empty string read.
        // This can lead to issues when you expect to read a line of text.
    }
}
 