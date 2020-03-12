package com.bd.proxy.dynamatic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xupeng
 * @date: 09/03/2020
 */
public class DynamicSubject implements InvocationHandler {
  private Object subject;

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    if (method.getName().equalsIgnoreCase("")) {
      System.out.println("before rent house");

      method.invoke(subject, args);
      System.out.println("after rent house");

    }
    return null;
  }
}
