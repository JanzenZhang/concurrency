package com.mmall.Dynamic;

import com.mmall.pattern.RealSubject;
import com.mmall.pattern.Subject;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{Subject.class}, new JdkProxySubject(new RealSubject()));
        subject.hello();
    }

}
