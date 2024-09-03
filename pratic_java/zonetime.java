package frame;

import java.time.*;

public class zonetime {
    public static void main(String[] args) {
        ZonedDateTime zobes=ZonedDateTime.now();
        System.out.println(zobes);
        ZoneId nea=ZoneId.of("Asia/Tokyo");
        ZonedDateTime time=ZonedDateTime.now(nea);
        System.out.println(time);
        ZoneId neork=ZoneId.of("America/New_York");
        ZonedDateTime pack=time.withZoneSameInstant(neork);
        System.out.println(pack);

        System.out.println();
        System.out.println();
        System.out.println();

        LocalDate start =LocalDate.of(2001,5,1);
        LocalDate End= LocalDate.of(2021,12,5);
        Period gap=Period.between(start,End);
        System.out.println("Mounth "+ gap.getMonths()+" Year "+ gap.getYears()+" Days"+ gap.getDays());

        LocalTime bgain=LocalTime.of(14,17);
        LocalTime end=LocalTime.of(23,2);
        Period big =Period.between(bgain,end);
        System.out.println("Hour" +big);

    }
}
