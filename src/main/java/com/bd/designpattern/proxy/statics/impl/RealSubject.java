package com.bd.designpattern.proxy.statics.impl;

import com.bd.designpattern.proxy.statics.Subject;

/**
 * @author xupeng
 * @date: 09/03/2020
 */
public class RealSubject implements Subject {
  public RealSubject() {
  }

  @Override
  public void request() {
    System.out.println("From real subject.");
  }
}
