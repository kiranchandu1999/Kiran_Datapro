public class StringClassExample{
    public static void main(String[] args) {
        String s1 = "datapro institute dwarakanagar";

        String s2 = new String("java");

        // System.out.println(s1);

        // methods:
        // length
        int res = s1.length();
        System.out.println(res);
        System.out.println("hello".length());

        // to get particular character at bgiven index
        System.out.println(s1.charAt(4)); 
        
        // to check whether given string starts with particular string or not
        System.out.println(s1.startsWith("d"));
        System.out.println(s1.endsWith("d"));

        // concaternation
        System.out.println("hii".concat("world"));

        // to convert into upper or lower case
        System.out.println(s1.toUpperCase());

        // to extract some string from original string
        System.out.println(s1.substring(0, 7));

        // to split original string into multiple small strings
        String[] res2 = s1.split(" ");
        System.out.println(res2[2]);

        // input: res2 ---> ["datapro", "institute", "dwarakanagar"]
        // output:  "datapro,institute,dwarakanagar"
        String fs = String.join(",", res2);
    
        System.out.println(fs);
    }
}
