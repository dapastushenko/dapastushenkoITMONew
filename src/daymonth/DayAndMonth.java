package daymonth;

import java.time.LocalDate;
import java.time.Year;

public class DayAndMonth {
    public static void main(String[] args) {
        for(int i=0,n=1;n<=12;n++) {
            LocalDate date1 = Year.of(2017).atMonth(n).atDay(13);
            System.out.println(String.valueOf(date1.getDayOfWeek()));
        if (String.valueOf(date1.getDayOfWeek())=="FRIDAY")
            i++;
            System.out.println(i);
        }


 //       System.out.printf(String.valueOf(dayOfWeek));



    }
}
