import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeAPI1 {

    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1990, Month.DECEMBER, 15);
        System.out.println(birthDay.getMonth());

        LocalDateTime to = LocalDateTime.of(2020, 10, 10, 10, 21, 1);
        System.out.println(to.getDayOfWeek());
    }
}
