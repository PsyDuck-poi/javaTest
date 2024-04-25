package com.example.sometest.iterator;

import java.util.ArrayList;
import org.junit.Test;

public class IteratorTest {
	@Test
	public void test() {
		  ArrayList<Integer> iList = new ArrayList<>();
		  iList.add(0);
		  iList.add(1);
		  iList.add(2);
		  iList.add(3);
		  iList.add(4);
		  
		  for (int num:iList) {
			  System.out.println(num);
			  iList.remove(num);
		  }
//		  Iterator<Integer> it=iList.iterator();
//		  while(it.hasNext()){
//			  System.out.println(it.next().toString());
//			  it.remove();
//		  }  
	}
}
