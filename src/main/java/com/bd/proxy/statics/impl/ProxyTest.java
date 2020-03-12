package com.bd.proxy.statics.impl;

import com.bd.proxy.statics.Subject;

/**
 * @author xupeng
 * @date: 09/03/2020
 */
public class ProxyTest {
  public static void main(String[] args) {
    Subject subject = new ProxySubject();
    subject.request();
  }
}
