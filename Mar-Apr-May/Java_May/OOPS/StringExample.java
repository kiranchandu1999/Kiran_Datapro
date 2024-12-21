package OOPS;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        char[] chArr = {'d', 'a', 't', 'a'};
        String s2 = "Java";

        int len = s1.length();


        // for(int i=0; i<len; i++){
        //     System.out.println(s1.charAt(i));
        // }

        // System.out.println(s1.concat(s2));
        // System.out.println(s1.contains("prod"));
        // System.out.println(s1.lastIndexOf("pro"));
        // System.out.println(s1.endsWith("o"));
        String substr = s1.substring(6, 13);
        // System.out.println(substr);

        // System.out.println(s1.replace('e', 'a'));
        // System.out.println(s1);

        

        for(String st : s1.split(" ")){
            // System.out.println(st);
        }

        for(char ch : s1.toCharArray()){
            // System.out.println(ch);
        }


    }
}
