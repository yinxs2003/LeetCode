package com.bd.proxy.dynamatic;

/**
 * @author xupeng
 * @date: 10/03/2020
 */
public class DynamicProxy implements Subject {
  //　这个就是我们要代理的真实对象
  private Object subject;

  //    构造方法，给我们要代理的真实对象赋初值
  public DynamicProxy(Object subject)
  {
    this.subject = subject;
  }

  @Override
  public void rent() {
    System.out.println("rent house proxy");
  }
}
