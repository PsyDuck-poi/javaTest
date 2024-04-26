package com.example.sometest.dateTime;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

//https://www.runoob.com/java/java-date-time.html

public class Date_Test {
    @Test
    public void test(String[] args) {

        Thread thread=new Thread(()->{
            Date d1=new Date();
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            while(true){
                String d2 = dateFormat.format(d1);
                System.out.println(d2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                d1=new Date();
            }
        });

        thread.start();

    }
}
