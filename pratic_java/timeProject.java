package frame;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class timeProject {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        DateTimeFormatter formats=DateTimeFormatter.ofPattern("mm/dd/yyyy");
        DateTimeFormatter timeing = DateTimeFormatter.ofPattern("HH:MM:SS");
        String formatdate=date.format(formats);
        String formattime=time.format(timeing);
        System.out.println(formatdate);
        System.out.println(formattime);

        LocalDate parsedDate = LocalDate.parse("31/08/2023", formats);
        System.out.println("Parsed date: " + parsedDate);
    }
}
