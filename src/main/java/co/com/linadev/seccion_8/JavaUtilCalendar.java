package co.com.linadev.seccion_8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        //calendar.set(2022, Calendar.JUNE, 25);

        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 25);

        calendar.set(Calendar.HOUR_OF_DAY, 17);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 13);

        
        System.out.println("calendar = " + calendar);
        System.out.println(date);

        // simple format
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateFormat = format.format(date);
        System.out.println("dateFormat = " + dateFormat);

    }
}
