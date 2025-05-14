import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class LocalDateTimeExample {
    public static void main(String[] args) {
        // local date class
        LocalDate today = LocalDate.now();

        // custom date
        LocalDate dob = LocalDate.of(2020, 10, 25);

        // expiration date
        LocalDate expirationDate = today.plusDays(30);

        System.out.println(today);

        System.out.println(dob);

        System.out.println(expirationDate);

        if(today.isAfter(dob)) {
            System.out.println("Date of birth is older than today");
        }
        else {
            System.out.println("Not older");
        }

        // custom date format
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        System.out.println(expirationDate.format(df));

        // LocalTime
        LocalTime presentTime = LocalTime.now();

        // custom time
        LocalTime time1 = LocalTime.of(11, 45, 56, 258);

        System.out.println(presentTime);

        System.out.println(time1);

        df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(presentTime.format(df));


        LocalDateTime dateTime = LocalDateTime.now();

        df = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss:ss a");

        System.out.println(dateTime.format(df));
    }
}