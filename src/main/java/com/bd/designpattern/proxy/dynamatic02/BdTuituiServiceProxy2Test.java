package com.bd.designpattern.proxy.dynamatic02;

import java.lang.reflect.Proxy;

/**
 * @author xupeng
 * @date: 20/03/2020
 */
public class BdTuituiServiceProxy2Test {
  public static void main(String[] args) {
    BdTuituiService02 bdTuituiService02 = new BdTuiTuiService02Impl();
    BdTuituiService02 proxy = (BdTuituiService02) Proxy.newProxyInstance(bdTuituiService02.getClass().getClassLoader(), bdTuituiService02.getClass().getInterfaces(), new BdTuiTuiServiceProxy2(bdTuituiService02));
    proxy.request();
  }
}
