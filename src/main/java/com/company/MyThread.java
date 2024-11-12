package com.company;

public class MyThread extends Thread{
    @Override
    public void run() {
        setPriority(1); //ustunvorlik
        try {
            sleep(100000);//uxlaatish
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        interrupt();//uyg'otish
        for (int i = 0; i < 10; i++) {
            System.out.println(getName());
        }
    }
}
