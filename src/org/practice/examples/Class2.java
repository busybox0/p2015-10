package org.practice.examples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Class2 {
    String nowAsString;
    void showDateAsString() {
        Date dt = new Date();
        System.out.println(dt);

        DateFormat simple_DATE_FORMAT_OBJ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        nowAsString = simple_DATE_FORMAT_OBJ.format(new Date());
        System.out.println(nowAsString);
        //simple_DATE_FORMAT_OBJ.parse()
        //simple_DATE_FORMAT_OBJ.format()
    }

    void setDateFromString() {
        this.showDateAsString(); // to have nowAsString initialized
        //nowAsString
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(nowAsString,dtf);
        System.out.println("localDateTime = " + localDateTime.format(dtf));
        //Calendar cal = Calendar.getInstance();


    }
    void playWithDate() {
        String strDate = "1977-10-06 11:12:23";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(strDate,dtf);
        System.out.println("ldt = " + ldt.format(dtf));
        System.out.println("ldt = " + ldt.plusHours(5L).plusSeconds(100L).format(dtf));

        ZoneOffset zo = ZoneOffset.ofHours(2);
        System.out.println("ldt.toEpochSecond = " + ldt.toEpochSecond(zo));

    }

}
