package com.company;

public class Resource {

    synchronized void method1(Resource r) {
        System.out.println(r);
    }

    synchronized void method2(Resource r) {
        System.out.println(r);
        Thread.yield();
//        Thread.sleep(10000);

    }
}
