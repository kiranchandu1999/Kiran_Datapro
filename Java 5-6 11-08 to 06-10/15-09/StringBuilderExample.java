class StringBuilderExample {
    static String makeAString(char[] arr) {
        StringBuilder res = new StringBuilder();
        for(char ch: arr) {
            res.append(ch);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        char[] letters = {'d', 'a', 't', 'a', 'p', 'r', 'o'};
        String result = makeAString(letters);
        System.out.println("Final string: " + result);

        // StringBuilder methods
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.setCharAt(2,'e'); // Heelo World
        sb.deleteCharAt(2); // Helo World
        sb.insert(2, "l"); // Hello World
        sb.replace(1, 4, "al"); // Halo World
        sb.reverse(); // dlroW olaH
        System.out.println(sb);
    }
}