package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world ! from github.com..");
        System.out.print("Arati Raut *");
        //System.out.println("Java Automation\n");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-digit  'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));


        /*
        //4/6/2020 2:20 pm
        int[] intArray={100,200,300};
        for (int a:intArray){
            System.out.println(a);
        }
        */
        //https://github.com/qalamsal/gitTest_HelloWorld_Project.git
    }
}
