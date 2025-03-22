import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        String[] courses = {"Java", "HTML", "CSS", "Python"};
        // join these string with proper formatting
        // "[Java, HTML, CSS, Python, C++]"

        // without string joiner
        String result = "[";

        for(String str: courses) {
            result = result + str + ", ";
        }

        result = result + "]";

        System.out.println(result);

        // with string joiner
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        for(String course: courses) {
            sj.add(course);
        }

        System.out.println(sj);

    }
}
