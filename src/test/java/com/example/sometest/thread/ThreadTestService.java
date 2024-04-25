package com.example.sometest.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class ThreadTestService {

    public static Logger logger= LoggerFactory.getLogger(ThreadTestService.class);

    public SimpleDateFormat dateFormat=new SimpleDateFormat("yy-MM-dd:hh-mm-ss");

    @Async("threadPoolTaskExecutor")
    public void threadTest() throws InterruptedException {
        logger.info("开启线程：" + new Date().getTime());
        logger.info("当前线程：" + Thread.currentThread().getName());
        //Thread.sleep(1000 * 2);
        int j=0;
        for(int i=0;i<=2000000;i++){
            j=j+i;
        }
        logger.info("线程结束：" + new Date().getTime());
    }
}
