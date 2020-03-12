package com.bd.proxy.statics2.proxy;

import com.bd.proxy.statics2.TuituiService;

/**
 * @author xupeng
 * @date: 09/03/2020
 */
public class ProxyTest {
  public static void main(String[] args) {
    TuituiService tuituiServiceProxy = new TuituiServiceProxy();
    tuituiServiceProxy.processData();
  }
}
