package com.example.sometest.dateTime;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class Date_Test02 {
    @Test
    public void test(String[] args) throws InterruptedException {
        //Date
        Date d1=new Date();
        System.out.println("d1:"+d1.hashCode()+":"+d1);

        Thread.sleep(1000);
        Date d2=new Date();
        System.out.println("d2:"+d2.hashCode()+":"+d2);

        Thread.sleep(1000);
        Date d3=new Date();
        System.out.println("d3:"+d3.hashCode()+":"+d3);

        //Calendar
        Calendar c1=Calendar.getInstance();
        System.out.println("c1："+c1.hashCode()+":"+c1.getTime());

        Thread.sleep(1000);
        Calendar c2=Calendar.getInstance();
        System.out.println("c2："+c2.hashCode()+":"+c2.getTime());

        Thread.sleep(1000);
        Calendar c3=Calendar.getInstance();
        System.out.println("c3："+c3.hashCode()+":"+c3.getTime());
        System.out.println("c2.equals(c3):"+c2.equals(c3));

        Calendar c4=Calendar.getInstance();
        Calendar c5=Calendar.getInstance();
        Calendar c6=Calendar.getInstance();
        System.out.println("c4："+c4.hashCode()+":"+c4.getTime());
        System.out.println("c5："+c5.hashCode()+":"+c5.getTime());
        System.out.println("c6："+c6.hashCode()+":"+c6.getTime());
        System.out.println("c4==c5:"+(c4==c5));
        System.out.println("c4.equals(c5):"+c4.equals(c5));

        Date d4=new Date();
        Date d5=new Date();
        Date d6=new Date();
        System.out.println("d4:"+d4.hashCode()+":"+d4);
        System.out.println("d5:"+d5.hashCode()+":"+d5);
        System.out.println("d6:"+d6.hashCode()+":"+d6);

    }
}
