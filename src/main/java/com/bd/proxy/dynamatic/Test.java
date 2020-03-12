package com.bd.proxy.dynamatic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author xupeng
 * @date: 10/03/2020
 */
public class Test {
  public static void main(String[] args) {
    RealSubject realSubject = new RealSubject();
//    InvocationHandler handler = new DynamicProxy(realSubject);
//    Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject
//            .getClass().getInterfaces(), handler);
//    subject.rent();
  }
}
