import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) throws Exception {
        
        
         LocalDate  date =   LocalDate.now();

           LocalDateTime  dateTime =                 LocalDateTime.now();

         System.out.println(date);

         System.out.println(dateTime);

            System.out.println("Day of Year "+date.getDayOfYear());
            System.out.println("Day of Week "+date.getDayOfWeek());

            System.out.println("Year "+date.getYear());

            System.out.println(" month "+ date.getMonth());


                System.out.println("add year "+date.plusYears(1));

                System.out.println("add month  "+date.plusMonths(1));

                System.out.println("minus 1  month  "+date.minusMonths(1));

                System.out.println("Is this Leap year "+date.isLeapYear());

           LocalDate  date2 =      LocalDate.of(1947, 8, 15);

            System.out.println(date2.isBefore(date));

            LocalTime time =    LocalTime.now();

                System.out.println("Minutes "+time.getMinute());


    }
}
