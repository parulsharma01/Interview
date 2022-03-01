package com.company;

public class Multithreading{
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        t1.start();
        RunnableTest t2 = new RunnableTest();
        t2.run();
        new Thread(t2).start();
        //lifecycle of thread
        /*
        * new
        * start
        * wait
        * notify
        * interrupt
        * sleep
        * runnable
        * end
        * */
    }
}
class ThreadTest extends Thread {
    @Override
    public void run() {
        System.out.println("Using Thread class");
    }
}
class RunnableTest implements Runnable{
    @Override
    public void run() {
        System.out.println("Using RUnnable");
    }
}



