package org.practice.examples;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

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

    void calendar() {

        Calendar cal = Calendar.getInstance(); //now
        Date dt1 = cal.getTime();// Calendar to Date conversion. getTime gives Date output

        Calendar cal2 = Calendar.getInstance(); //now;
        cal2.setTime(dt1);  // Date to Calendar

    }

    void fileOpen() throws FileNotFoundException {
        //System.out.println(System.getProperty("user.dir"));
        File f = new File("textfile.txt");
        System.out.println(f.exists() ? "file exists" : "file NOT exists");
        System.out.println("str1 = " + f.getName());
        System.out.println("getAbsolutePath = " + f.getAbsolutePath());
        System.out.println("length = " + f.length());

        FileInputStream fis = new FileInputStream(f) ;
        try {
            System.out.println(fis.read());
            System.out.println(fis.read());
        } catch (IOException e) {
            System.out.println("IOException");

        }

        Scanner scn = new Scanner(f);
        System.out.println( scn.nextLine());
        System.out.println( scn.nextLine());
        System.out.println( scn.nextLine());
        String str;
        str = scn.next();
        scn.useDelimiter(Pattern.compile("a"));
        System.out.println("str = " + str);
        str = scn.next();
        System.out.println("str = " + str);
        str = scn.next();
        System.out.println("str = " + str);

        System.out.println(scn.toString());
        int i = 0;
        while (  scn.hasNext()) {
            scn.next();
            i++;
        }
        System.out.println("i = " + i);



    }

    void fileCreate(String name) throws IOException {

        File f = new File(name);
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("File was created.");
        }
        System.out.println("f.isFile " + f.isFile());
        PrintWriter prntWrtr = new PrintWriter(f);
        prntWrtr.write("Hello\n");
        prntWrtr.append("Append\n\n");
        prntWrtr.println("ololo");
        prntWrtr.append("okoko\n\n");
        prntWrtr.close();
        System.out.println((f.delete()) ? "deleted" : "NOT deleted");


    }
}





















