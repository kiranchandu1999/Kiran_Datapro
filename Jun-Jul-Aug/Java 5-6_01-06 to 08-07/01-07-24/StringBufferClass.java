public class StringBufferClass{
    public static void main(String[] args) {
        // create StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // to set char at particular index
        sb.setCharAt(1, 'a');

        // to append / add another string 
        sb.append(" datapro");

        // insert new data inside original string
        sb.insert(5, "hii");

        // delete a particular character
        sb.deleteCharAt(1);
        // to delete substring in  -->> Hllohii datapro
        sb.delete(3, 7);

        // to reverse direction of entire string
        sb.reverse();

        System.out.println(sb);

    }
}