package collection;

import java.util.*;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();

        // adding
        st.push(4);
        st.push(6);
        st.push(2);
        
        // removing
        // st.pop();

        // to remove all elements in stack
        st.clear();

        System.out.println(st.isEmpty());
        // System.out.println(st.peek());

        // System.out.println(st);

    }
}
