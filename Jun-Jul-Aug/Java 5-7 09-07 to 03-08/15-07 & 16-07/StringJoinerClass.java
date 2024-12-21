import java.util.StringJoiner;

public class StringJoinerClass {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        String[] arr = {"java", "python", "c#", "c++"};

        for(String str : arr){
            sj.add(str);
        }

        System.out.println(sj);
    }
}
