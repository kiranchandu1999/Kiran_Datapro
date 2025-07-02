import java.util.StringJoiner;
// import java.util.StringTokenizer;

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

        StringJoiner sj2 = new StringJoiner("$", "(", ")");
        sj2.add("Windows");
        sj2.add("Linux");

        sj.merge(sj2);

        System.out.println(sj);
        System.out.println(sj2);

        // StringTokenizer st = new StringTokenizer("Hello world how are you");
        // System.out.println(st.nextToken());
    }
}
