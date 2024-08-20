package lesson11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateSample {

    public static void main(String[] args) {
        // 日付
        LocalDate date = LocalDate.now();
        System.out.println("現在のLocalDateは" + date);
        // 時間
        LocalTime time = LocalTime.now();
        System.out.println("現在のLocalTimeは" + time);
        // 日時
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("現在のLacalDateTimeは" + dateTime);

    }

}