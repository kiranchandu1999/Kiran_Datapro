import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        String[] arr1 = {"Java", "Python", "C++"};

        // result: ("Java", "Python", "C++", "Javascript")

        String result = "(";

        for(String str: arr1) {
            result = result + str + ", ";
        }

        result = result + ")";

        System.out.println(result);

        // using StringJoiner

        StringJoiner sj = new StringJoiner(", ", "(", ")");

        for(String str: arr1) {
            sj.add(str);
        }

        System.out.println(sj);

        // new course added
        sj.add("Javascript");

        String result2 = sj.toString();

        System.out.println(result2);
        
    }
}
