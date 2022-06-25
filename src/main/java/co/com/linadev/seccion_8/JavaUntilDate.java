package co.com.linadev.seccion_8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUntilDate {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println("date = " + date);

        // simple Date
        SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        String dateStr = df.format(date);
        System.out.println("dateSrt = " + dateStr);
    }
}
