import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeClassTest {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();

        LocalTime time1 = LocalTime.now();

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM-yy");
        df.format(date1);

        System.out.println(date1);
        System.out.println(df.format(date1));
        System.out.println(time1);
        System.out.println(dateTime);

        LocalDate customDate = LocalDate.parse("2024-06-16");
        LocalDate date2 = customDate.withMonth(10);
        System.out.println(customDate);
        System.out.println(date2.getMonth());

        // System.out.println(WeekEnum.SUNDAY);

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss");
        System.out.println(df2.format(dateTime));
    }
}