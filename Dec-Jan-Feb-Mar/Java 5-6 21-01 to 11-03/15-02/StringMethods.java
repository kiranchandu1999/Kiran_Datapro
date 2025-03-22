class StringMethods {
    public static void main(String[] args) {
        // string object creation
        String s1 = new String("Hello"); // will store in heap memory
        String s2 = new String("Hello");

        String s3 = "Hello"; // will store in string pool area
        String s4 = "Hello";

        // string methods
        System.out.println(s3.toUpperCase());
        s3 = s3 + " world ooo"; // string concatenation
        System.out.println(s3);
        // System.out.println(s4);

        System.out.println(s3.toLowerCase());

        System.out.println(s3.length());

        System.out.println(s3.charAt(6));

        System.out.println(s4.concat(" vizag"));

        System.out.println(s3.contains("wol"));

        System.out.println(s3.substring(6, 11));

        System.out.println(s3.indexOf("o", 0, 4));

        String name1 = "Murali";
        String name2 = "murali";
        String name3 = "Ganesh";

        System.out.println(name1.compareTo(name2));
        // System.out.println(name1.compareToIgnoreCase(name2));

        System.out.println(s3.endsWith("o"));
    }
}