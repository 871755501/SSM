package com.heliyijie;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadFactoryTest {
    //存放任务的阻塞队列
    BlockingDeque<Runnable> queue =new LinkedBlockingDeque<>(10);
    //BasicThreadFactory是实现ThreadFactory
    BasicThreadFactory factiry= new BasicThreadFactory();
    ThreadPoolExecutor poolExecutor= new ThreadPoolExecutor(3,10,
            60,TimeUnit.SECONDS,queue,factiry,(Runnable r,ThreadPoolExecutor executor)->{
        System.out.println(executor.getQueue().size()+"消息队列已满");
        System.out.println("拒绝服务");
    });
}
