package com.bd.proxy.dynamatic;

/**
 * @author xupeng
 * @date: 10/03/2020
 */
public class RealSubject implements Subject {
  @Override
  public void rent() {
    System.out.println("RealSubject");
  }
}
