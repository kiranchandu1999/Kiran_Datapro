import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

class DateClassExample {
    public static void main(String[] args) {
        // Date d1 = new Date();

        // System.out.println(d1);

        // it gives current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        // custom date
        LocalDate customDate = LocalDate.parse("2023-06-20");
        System.out.println(customDate);

        // to formate the existing date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(df.format(customDate));
        // System.out.println(customDate.getDayOfMonth());
        System.out.println(customDate.getMonth());
        System.out.println(customDate.getDayOfWeek());

        System.out.println(date1.isBefore(customDate));

        // local time
        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println(time.getMinute());

        // custom time
        LocalTime customTime = LocalTime.of(6, 25);
        System.out.println(customTime);
    }
}