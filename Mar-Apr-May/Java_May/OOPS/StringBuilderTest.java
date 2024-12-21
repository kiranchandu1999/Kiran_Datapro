package OOPS;

import java.util.StringJoiner;

public class StringBuilderTest {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer();

        StringBuilder sb = new StringBuilder();
        
        sb.append("Hello");
        sb.append(" World");

        // sb.setCharAt(1, 'a');
        // sb.deleteCharAt(1);

        sb.delete(0, 3);

        sb.reverse();

        // System.out.println(sb);

        StringJoiner sj = new StringJoiner(",", "[", "]" );
        sj.add("Java");
        sj.add("Python");
        System.out.println(sj);
    }
}
