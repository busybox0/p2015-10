package org.practice.examples;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by max on 2015-10-08.
 */
public class Class1 {
    String s1 = new String("Hello Max!");
    String s2 = new String("");
    String s3;
    double d1 = 123_456_789_012D;

    void showEmpty() {
        try {
            System.out.println(s3.isEmpty() ? "isEmpty" : "Not empty!");
        } catch (NullPointerException npEx) {
            //e.printStackTrace(System.out);
            System.out.println("String is not initialized");
        }
    }
    void lengthOfStringAndContains() {

        System.out.println( s1.length());
        if (s1.contains("o M")) {
            System.out.println("contains");
        } else {
            System.out.println("not contains");
        }

    }

    void replaceSubstring() {
        String what = "o M";
        String to = "o dear M";
        String result;

        if (s1.contains(what)) {
            result = s1.replace(what, to);
            System.out.println("result = " + result);
        } else {
            System.out.println("replaceSubstring not replaced anything!");
        }
    }

    void splitStringByDelimiter() {
        String[] arr = s1.split(" ");
        System.out.println("arr.length= " + arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
    }

    void getSubStringByStartEndIndexes() {
        String tmp = s1.substring(6,9);
        System.out.println("tmp = " + tmp);
        char[] chArray = s1.toCharArray();
        System.out.println("chArray.length = " + chArray.length);
    }

    void formatString() {
        System.out.printf(("ok, the string representation of double number is:  %+,.2f XXX\n"),d1);
    }

    void convertDoubleToString() {
        Double D2 = d1;
        System.out.println("D2.toString = " + D2.toString());
        System.out.println("d1 = " + d1);

    }

    void inputFromKeyboard() {
        // Replace the first character of the name by correspondent upper case character;
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Enter any value:");
        String value = stdIn.next();
        String first;  String result;
        System.out.println("value = " + value);
        value=value.trim();
        first =  value.substring(0,1);
        //System.out.println("first = " + first);
        //value=value.substring(1);
        first=first.toUpperCase();
        result=first + value.substring(1);
        System.out.println("result = " + result);

    }

    void capitalize2() {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Enter any value:");
        String value = stdIn.next();
        String s =  value.trim().substring(0,1).toUpperCase() + value.substring(1);
        System.out.println("s = " + s);
    }

    String useSwitch(int month, String monthName) {
        String returnString;
        switch (month) {
            case (1):
            case (2):
            case 3:
                returnString = "first quarter";
                break;
            case 4:
            case 5:
            case 6:
                returnString = "second quarter";
                break;
            case 7:
            case 8:
            case 9:
                returnString = "third quarter";
                break;
            case 10:
            case 11:
            case 12:
                returnString = "fourth quarter";
                break;
            default:
                System.out.println("WRONG MONTH #!!!");
                returnString = "Hey, it's WRONG MONTH #!!!";
        }
        return ("The month # " + month + "(" + monthName + ") is in " + returnString) ;
    }

}
