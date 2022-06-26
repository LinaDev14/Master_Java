package co.com.linadev.seccion_8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringToDate {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Enter a date with formatting 'yyyy-MM-dd");
        try{

            Date date = format.parse(s.next());

            System.out.println("date = " + date);
            System.out.println("format = " + format.format(date));

            Date date2 = new Date();

            var compare = date.after(date2) ? "Date is greater than Date2" : "Date2 is greater than Date";
            System.out.println(compare);

        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
