class StringBuilderExample {
    
    String makeString(char[] chars) { // [d, a, t, a, p, r, o]
        // add all chars to make a new string
        StringBuilder result = new StringBuilder();

        for(char ch: chars) {
            // result = result + ch;
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Strings are immutable
        // String str = "Hi";
        // str = str + " Hello";
        // System.out.println(str);

        char[] chars = {'d', 'a', 't', 'a', 'p', 'r', 'o'};

        StringBuilderExample obj = new StringBuilderExample();
        System.out.println(obj.makeString(chars));


        // StringBuilder methods
        StringBuilder sb = new StringBuilder("Hello World!!");

        sb.setCharAt(2, 'e'); // Heelo World!!

        sb.deleteCharAt(3); // Heeo World!!

        sb.delete(5, 10); // Heeo !!

        sb.insert(5, "World"); // Heeo World!!

        sb.replace(2, 3, "ll"); // Hello World!!

        sb.reverse(); // !!dlroW olleH

        System.out.println(sb);
    }
}