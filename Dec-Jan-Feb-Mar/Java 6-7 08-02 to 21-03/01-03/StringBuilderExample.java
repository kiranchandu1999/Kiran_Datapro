public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("first");
        sb.append(" second");

        sb.setCharAt(2, 'q');
        sb.insert(2, 'r');
        sb.deleteCharAt(3);

        sb.delete(6, sb.length());
        sb.replace(0, sb.length(), "second");

        sb.reverse();

        sb.toString();

        System.out.println(sb);
    }
}