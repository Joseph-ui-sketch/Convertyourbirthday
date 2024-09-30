import java.time.*;

public class App {

    public static void main(String[] args) {


         LocalDate aDate = LocalDate.of(0,9, 26);
         System.out.println(aDate);
         LocalDate rightNowDate = LocalDate.now();
         System.out.println(rightNowDate);

         LocalTime aTime = LocalTime.of(12, 59, 38);
         System.out.println(aTime);
         LocalTime rightNowTime = LocalTime.now();
         System.out.println(rightNowTime);

         int lastSecond = 0;
         int currentSecond = 0;

         while(true){
             LocalTime rightNow = LocalTime.now();
             int hours = rightNow.getHour();
             int minutes = rightNow.getMinute();
             currentSecond = rightNow.getSecond();
             if(lastSecond != currentSecond){
                 System.out.println(hours + ":" + minutes + ":" + currentSecond);
             }
             lastSecond = currentSecond;
         }

         LocalDateTime rightNowDateTime = LocalDateTime.now(1980, 6, 12, 7, 15, 55);
         System.out.println(rightNowDateTime);
        LocalDateTime birthday = LocalDateTime.of(1981, 4, 28, 3, 11, 0);
        ZoneId us = ZoneId.of("America/New_York");
        ZonedDateTime birthdayZoned = ZonedDateTime.of(birthday, us);

        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime birthdayParis = birthdayZoned.withZoneSameInstant(london);
        System.out.println(birthdayZoned);
        System.out.println(birthdayParis);




    }


}