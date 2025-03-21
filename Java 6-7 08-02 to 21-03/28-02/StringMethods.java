public class StringMethods {
    public static void main(String[] args) {
        // string literal
        String s1 = "Datapro";
        String s2 = "Datapro";

        // string using new keyword
        String s3 = new String("Java");
        String s4 = new String("Java");

        // methods
        int len = s1.length();

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println(s1.charAt(4));

        System.out.println(s1.substring(0, 4));

        System.out.println(s1.compareTo(s2));

        System.out.println(s1.concat(s3));

        System.out.println(s1.contains("pro"));

        System.out.println(s1.indexOf('a'));

        System.out.println("Hello datapro".split(" ")[0]);

        System.out.println(s1.subse);
    }
}
