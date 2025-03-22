public class StringMethods {
    public static void main(String[] args) {
        // string variable creation
        String str1 = "datapro";  // it will be created inside string pool area

        String str3 = "datapro";

        String str2 = new String("welcome");  // it will be created inside heap
        String str4 = new String("welcome");

        char[] chars = new char[] {'w', 'e', 'l', 'c', 'o', 'm', 'e'};
        String newStr = "";

        for(char ch : chars) {
            newStr = newStr + ch;
        }

        // methods
        System.out.println(str1.toUpperCase());
        System.out.println(str1);

        System.out.println(str3.toLowerCase());

        System.out.println(str1.charAt(5));

        System.out.println(str2.concat(" ").concat(str1));

        System.out.println(str1.length());

        System.out.println(str1.substring(4, 7));
        System.out.println(str1.substring(4));

        System.out.println(str2.indexOf("eld"));

        System.out.println(str2.indexOf('e', 3));

        System.out.println(str1.compareTo(str3));

        System.out.println(str2.contains("c"));

        System.out.println(str2.replace("co", "bo"));

        System.out.println(str2.startsWith("wa"));
    }
}
