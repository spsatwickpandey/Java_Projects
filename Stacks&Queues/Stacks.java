import java.util.*;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        st.push(40);
        st.push(30);
        st.push(20);
        st.push(10);

        System.out.println(st);

        System.out.println(st.peek());
        
        st.pop();
        System.out.println(st);

        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
