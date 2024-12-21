public class StringClassTest{ 
    public static void main(String[] args) {
        // using string literal
        String s1 = "datapro";
        String s5 = new String("Hii");
        System.out.println(s5);

        // here it won't create new object inside string constant pool
        String s2 = "datapro";

        // using new keyword
        String s3 = new String("java");

        System.out.println(s1 + " " + s2 + " " + s3);

        // methods
        // to get char at given index
        char res = s1.charAt(5);
        System.out.println(res);

        // to get string size
        int len = s1.length();
        System.out.println(len);

        // to check whether string starts with some strinng or not
        boolean val = s2.startsWith("da");
        System.out.println(val);
        System.out.println(s3.endsWith("a"));

        // to check whether given string present or not
        System.out.println(s1.contains("pr"));

        // to convert either upper case or lower case
        String upper = s1.toUpperCase();
        System.out.println(upper);

        // string concatenation
        System.out.println(s1.concat(" ".concat(s3)));

        // to get the given string starting index
        System.out.println("Ajalya is studying in datapro".indexOf("datapro"));

        // to extract something from a big string
        System.out.println("Ajalya is studying in datapro".substring(24, 28));
    }
}