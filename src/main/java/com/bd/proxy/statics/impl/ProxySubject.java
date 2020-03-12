package com.bd.proxy.statics.impl;

import com.bd.proxy.statics.Subject;

/**
 * @author xupeng
 * @date: 09/03/2020
 */
public class ProxySubject implements Subject {
  private RealSubject realSubject;

  public ProxySubject() {
  }

  @Override
  public void request() {
    doBefore();

    if (realSubject == null) {
      realSubject = new RealSubject();
    }
    realSubject.request();

    doAfter();
  }

  private void doAfter() {
    System.out.println("after");
  }

  private void doBefore() {
    System.out.println("before");
  }

}
