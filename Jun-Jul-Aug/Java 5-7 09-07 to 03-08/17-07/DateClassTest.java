import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassTest{
    public static void main(String[] args){
        Date d1 = new Date();

        // System.out.println(d1);
        // System.out.println(d1.getTime());
        // System.out.println(d1.getDate());

        // DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
        // System.out.println(df.format(d1));

        // DateFormat df2 = DateFormat.getTimeInstance(DateFormat.SHORT);
        // System.out.println(df2.format(d1));


        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy hh:mm:ss");
        System.out.println(sdf.format(d1));
    }
}