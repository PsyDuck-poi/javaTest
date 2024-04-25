package com.example.sometest.dateTime;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.junit.Test;


public class TimerTest {

	@Test
	public void test(){

		Timer timer01=null;
		TimerTask timerTest01=new TimerTask(){
			@Override
			public void run(){
				printF();
			}
		};
		timer01=new Timer();
		timer01.schedule(timerTest01, 3*1000);
		
		//timer01=new Timer();
		//timer01.schedule(timerTest01, 2*1000);
	}
	
	public static void printF(){
		//HashSet<String> hashSet=new HashSet<>();
		System.out.println(new Date().toString());
	}
}
