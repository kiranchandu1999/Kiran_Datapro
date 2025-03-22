import java.util.StringJoiner;

public class StrinngJoinerTest {
    public static void main(String[] args) {
        String[] arr = new String[] {"java", "c++", "python"};

        // output string --->  "[ java, c++, python ]"
        // without using string joiner
        StringBuilder str = new StringBuilder("[");

        for(String s : arr) {
            str.append(s + ", ");
        }

        str.delete(str.length() - 2, str.length());
        str.append("]");

        System.out.println(str);

        // using string joiner
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        for(String s : arr) {
            sj.add(s);
        }

        System.out.println(sj);
    }
}
