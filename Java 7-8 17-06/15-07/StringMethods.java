public class StringMethods {
    public static void main(String[] args) {
        // methods
        String str = "Datapro";

        System.out.println(str.toUpperCase()); // DATAPRO
        
        System.out.println(str.charAt(2)); // t

        System.out.println(str.length()); // 7

        String s1 = "Hello";

        String s2 = "World!!";

        String greet = s1.concat(" ").concat(s2); // Hello World!!

        System.out.println(s1 + " " + s2);

        System.out.println(greet.substring(6, 11));

        System.out.println(greet.indexOf("World")); // index 6

        // count no.of words in following para
        String para = "first second third forth fifth sixth seventh";

        String[] words = para.split(" ");
        System.out.println(words.length);

        System.out.println(para.startsWith("fir")); // true
        System.out.println(para.endsWith("venth")); // true

        System.out.println(para.contains("worth")); // false
        System.out.println(para.replace("first", "fir"));
        System.out.println(para);
    }
}
