public class StringBuilderTest {
    static void m1(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        // StringBuilder or StringBuffer
        StringBuilder sb = new StringBuilder("datapro");

        // StringBuffer sb1 = new StringBuffer();

        Integer a = 10;

        // methods
        sb.setCharAt(4, 'b');

        m1(sb.toString());
        
        sb.append(" hello");

        sb.delete(4, 7);

        // sb.deleteCharAt(2); // deletes only one character

        sb.insert(4, "pro");

        sb.lastIndexOf("a");

        sb.reverse();

        System.out.println(sb);
    }
}