package com.zhaolei.threadStatus;

/**
 * 创建线程的几种方式
 * 一、继承Thread,并覆盖run（）方法
 * 二、实现runnable接口，实现run()方法
 * 三、匿名内部类
 * 四、实现callable接口
 * 五、定时器
 * 六、
 */


/**
 * 继承Thread,并覆盖run（）方法
 * 这种方法直接调用start()方法启动线程
 */
class ExtendsThread extends Thread{
    @Override
    public void run(){
        System.out.println("这是实现Thread的方法");
    }
}
public class CreatThread {
    public static void main(String []args){
        ExtendsThread t=new ExtendsThread();
        t.start();

    }
}
