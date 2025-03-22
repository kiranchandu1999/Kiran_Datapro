class StringBuilderExample {
    public static void main(String[] args) {
        char[] arr1 = {'d', 'a', 't', 'a', 'p', 'r', 'o'};
        // string modification using strings will lead to creation of more number of strngs
        String result = "";

        for(char ch: arr1) {
            result = result + ch;
        }

        System.out.println(result);

        // using StringBuilder
        StringBuilder sb = new StringBuilder();

        for(char ch: arr1) {
            sb.append(ch);
        }

        String result2 = sb.toString();

        System.out.println(result2);

        // methods "datapro"
        System.out.println(sb.insert(3, "s"));

        System.out.println(sb.deleteCharAt(3));

        System.out.println(sb.insert(4, "extra"));

        System.out.println(sb.delete(4, 9)); // datapro

        sb.setCharAt(3, 'o');

        System.out.println(sb); // datopro

        System.out.println(sb.reverse()); // orpotad

        System.out.println(sb.replace(0, 3, "datapro")); // dataprootad

        System.out.println(sb.subSequence(4, 7));
        System.out.println(sb);
    }
}