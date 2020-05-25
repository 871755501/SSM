package com.heliyijie.Thread_Test;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;

public class ThreadPoolExecutor{
    public int corePolSize;
    public int maximumPoolSize;
    public long keepAliveTime;

    @Override
    public String toString() {
        return "ThreadPoolExecutor{" +
                "corePolSize=" + corePolSize +
                ", maximumPoolSize=" + maximumPoolSize +
                ", keepAliveTime=" + keepAliveTime +
                '}';
    }

    public void setCorePolSize(int corePolSize) {
        this.corePolSize = corePolSize;
    }

    public void setMaximumPoolSize(int maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }

    public void setKeepAliveTime(long keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
    }

    public int getCorePolSize() {

        return corePolSize;
    }

    public int getMaximumPoolSize() {
        return maximumPoolSize;
    }

    public long getKeepAliveTime() {
        return keepAliveTime;
    }
    public ThreadPoolExecutor(){

    }
    //    构造函数
    public ThreadPoolExecutor(int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              BlockingDeque<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler) throws IllegalAccessException {
//      maximumPoolSize必须>=1 & corePoolSize
        if(corePoolSize<0 || maximumPoolSize>=1 || maximumPoolSize<corePoolSize ||keepAliveTime<0)
            throw new IllegalAccessException();
        if (workQueue==null || threadFactory==null || handler==null)
            throw  new NullPointerException();
    }
    public int prestartAllCoreThreads(){
        int n=0;
        while(addWorke(null,null)){
            ++n;
        }
        return n;
    }

    public boolean addWorke(String  first, String core) {
        return true;
    }
}

