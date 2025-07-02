import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class LocalDateTimeExample {
    public static void main(String[] args) {
        // LocalDate
        LocalDate today = LocalDate.now();

        System.out.println(today);

        // custom date
        LocalDate dob = LocalDate.of(2020, Month.AUGUST, 18);

        System.out.println(dob);

        // instance methods
        // custome formatter
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM-d-yy");

        System.out.println(dob.format(df));

        if(dob.isBefore(today)) {
            System.out.println("Your DOB is before today");
        }
        else {
            System.out.println("Not before today");
        }

        System.out.println("Person age from dob: " + Period.between(dob, today));

        LocalDate tenDaysBeforeToday = today.minusDays(10);
        System.out.println(tenDaysBeforeToday);

        // LocalTime
        LocalTime presentTime = LocalTime.now();

        System.out.println(presentTime);

        // custom time
        LocalTime customTime = LocalTime.of(10, 25, 32);

        System.out.println(customTime);

        System.out.println(presentTime.getHour());

        // LocalDateTime
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTime);

        df = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");

        System.out.println(dateTime.format(df));

        // converting string to date object
        String joiningDate = "2025-04-10";

        LocalDate convertedDate = LocalDate.parse(joiningDate);

        System.out.println(convertedDate);

        // parsing custom format string
        String dummyDate = "15-03-2025";
        df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate formatedDate = LocalDate.parse(dummyDate, df);

        System.out.println(formatedDate.format(df));
    }
}