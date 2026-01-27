import java.util.StringJoiner;

class StringJoinerExample {
    public static void main(String[] args) {
        String[] courses = {"Java", "Python", "C++", "Javascript"};
        // ["Java", "Python", "C++", "Javascript"]
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.setEmptyValue("No courses found");

        StringJoiner sj2 = new StringJoiner("$ ", "{", "}");
        sj2.add("HTML");
        sj2.add("CSS");

        for(String c: courses) {
            sj.add(c);
        }

        System.out.println(sj.toString());

        sj.merge(sj2);
        System.out.println(sj);
    }
}
