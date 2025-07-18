import java.util.*;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isDuplicate(s));
    }

    public static boolean isDuplicate(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++ ){
            char c = s.charAt(i);
            if(c==')'){
                if(st.peek()=='('){  //empty bracket case
                    return true;
                }
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();  //only for opening bracket
            }
            else{
                st.push(c);
            }
        }
        return false;
    }
}
