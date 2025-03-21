import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class DateClassTest {
    public static void main(String[] args) {
        Date d1 = new Date();

        System.out.println(d1.getMinutes());

        // to format the date 
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);

        System.out.println(df.format(d1));

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
        
        System.out.println(sdf.format(d1));
    }
}