import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // [Java, Python, C, C++, Go]

        String[] languages = {"Java", "Python", "C", "C++", "Go"};

        // String str = "[";

        // for(String lang: languages) {
        //     str = str + lang + ", ";
        // }

        // str = str + "]";

        // System.out.println(str);

        // using StringJoiner
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.setEmptyValue("No values found");

        for(String lang: languages) {
            sj.add(lang);
        }

        sj.add("JavaScript");

        System.out.println(sj);
    }
}
