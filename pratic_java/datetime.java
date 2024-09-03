package frame;
 import java.time.*;
public class datetime {
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();
        LocalTime time=LocalTime.now();
        LocalDateTime total=LocalDateTime.now();
        LocalDate somedate=LocalDate.of(20004,11,22);
        LocalTime thistime=LocalTime.of(14,45,24);
        LocalDate aweek=now.plusDays(+7);
        LocalDate subrat=now.minusMonths(4);
        LocalDate fori=now.withDayOfMonth(7);


        System.out.println("Today Date is "+now);
        System.out.println("Current Time "+time);
        System.out.println("Date and Time "+total);
        System.out.println("Date is "+ somedate);
        System.out.println("Time is "+thistime);
        System.out.println("Add Day "+ aweek);
        System.out.println("date "+ fori);
    }
}
