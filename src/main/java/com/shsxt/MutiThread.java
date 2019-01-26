package com.shsxt;

public class MutiThread {
    static final Test t=new Test();
    public static void main(String[] args) {
        Thread t1 = new Thread(){
          public void run(){
              t.synchronizedMethod();
          }
        };
        Thread t2 = new Thread(){
            public void run(){
                t.generalMethod();
            }
        };
        t1.start();
        t2.start();
    }
}
class Test{
    public synchronized void synchronizedMethod(){
        System.out.println("开始调用synchronizedMethod");
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("完成调用synchronizedMethod");
    }
    public synchronized static void generalMethod(){
        System.out.println("叫generalMethod...");
    }
}
