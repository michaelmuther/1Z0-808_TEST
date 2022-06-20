import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date4 {

    public static void main(String[] args) {
        // dates
//        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2021, Month.JANUARY, 13);
        ld2 = ld2.plusDays(3);
        // times

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd 'farts' MMM yyyy");
        System.out.println(ld2.format(dtf));
        System.out.println(dtf.format(ld2));

        LocalTime lt = LocalTime.of(14, 38);
        //date and times
        LocalDateTime ldt = LocalDateTime.of(ld2, lt); // just plug the ld and lt into the ldt object constructor
        //zoned date and times
//        for (String zone : ZoneId.getAvailableZoneIds()){
//            System.out.println(zone);
//        }

        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Cuba"));
        System.out.println(zdt);
//        System.out.println(ld);
//        System.out.println(ld2);
//        System.out.println(lt);
//        System.out.println(ldt);

    }
}
