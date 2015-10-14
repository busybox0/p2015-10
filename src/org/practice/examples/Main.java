package org.practice.examples;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {



/*
        Class1 c1 = new Class1();
        c1.showEmpty();
        c1.lengthOfStringAndContains();
        c1.replaceSubstring();
        c1.splitStringByDelimiter();
        c1.getSubStringByStartEndIndexes();
        c1.formatString();
        c1.convertDoubleToString();
        //c1.inputFromKeyboard();
        //c1.capitalize2();
        System.out.println(c1.useSwitch(2, "Feb"));
*/
       Class2 c2 = new Class2();
        //c2.setDateFromString();
        //c2.playWithDate();
        //c2.calendar();
        //c2.fileOpen();
        c2.fileCreate("new.txt");

    }
}
