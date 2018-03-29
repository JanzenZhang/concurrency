package com.mmall.pattern;

public class RealSubject implements Subject {

    @Override
    public void request() {

        System.out.println("execute real request");

    }

    @Override
    public void hello() {
        System.out.println("hello");
    }
}
