package com.example.sometest.thread;

import com.example.sometest.SomeTestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SomeTestApplication.class)
public class ThreaTest {
    @Autowired
    ThreadTestService threadTestService;

    @Test
    public void threadTest() throws InterruptedException {
        for(int i=0;i<5;i++){
            threadTestService.threadTest();
        }
    }
}
