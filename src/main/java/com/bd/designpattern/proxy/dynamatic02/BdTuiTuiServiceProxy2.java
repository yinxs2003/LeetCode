package com.bd.designpattern.proxy.dynamatic02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xupeng
 * @date: 20/03/2020
 */
public class BdTuiTuiServiceProxy2 implements InvocationHandler {

  private BdTuituiService02 service02;

  public BdTuiTuiServiceProxy2(BdTuituiService02 service02) {
    this.service02 = service02;
  }


  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    System.out.println("do before");

    Object obj = method.invoke(service02, args);

    System.out.println("do after");
    return obj;
  }
}
