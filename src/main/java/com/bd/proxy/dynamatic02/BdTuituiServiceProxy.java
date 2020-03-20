package com.bd.proxy.dynamatic02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xupeng
 * @date: 20/03/2020
 */
public class BdTuituiServiceProxy implements InvocationHandler {
  BdTuituiService02 tuituiService;  // 被代理的对象，实际的方法执行者

  BdTuituiServiceProxy(BdTuituiService02 tuituiService) {
    this.tuituiService = tuituiService;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("before");
    Object result = method.invoke(tuituiService, args);
    System.out.println("after");
    return result;
  }
}
