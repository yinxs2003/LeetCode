package com.bd.proxy.dynamatic02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author xupeng
 * @date: 20/03/2020
 */
public class DynamaticProxyTest {
  public static void main(String[] args) {
    BdTuituiService02 tuituiService = new BdTuiTuiService02Impl();
    BdTuituiService02 proxy = (BdTuituiService02) Proxy.newProxyInstance(BdTuituiService02.class.getClassLoader(), tuituiService.getClass().getInterfaces(), new BdTuituiServiceProxy(tuituiService));
    proxy.request();
  }
}
