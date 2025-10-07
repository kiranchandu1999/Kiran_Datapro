public class StringExample {
    public static void main(String[] args) {
        // String object and methods
        // Strings are immutable
        String s1 = "datapro";
        s1 = s1 + " branch";
        System.out.println(s1); // datapro branch

        // methods
        System.out.println(s1.length()); // 14
        System.out.println(s1.charAt(5)); // r
        System.out.println(s1.indexOf("a")); // 1
        System.out.println(s1.lastIndexOf("a")); // 10
        System.out.println(s1.substring(4, 7)); // pro
        System.out.println(s1.endsWith("anch")); // true
        System.out.println(s1.split(" ")[0]); // datapro
    }
}
