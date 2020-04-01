package com.bd.proxy.dynamatic03.test;

import com.bd.proxy.dynamatic03.BdTuituiService03;
import com.bd.proxy.dynamatic03.impl.BdTuituiServiceImpl;
import com.bd.proxy.dynamatic03.proxy.DynamaticProxy03;
import com.bd.proxy.static3.BdTuituiService;

import java.lang.reflect.Proxy;

/**
 * @author xupeng
 * @date: 31/03/2020
 */
public class Test {
  public static void main(String[] args) {
    System.out.println("hello");
    BdTuituiService03 bdTuituiService03 = new BdTuituiServiceImpl();
    BdTuituiService03 bdTuituiServiceProxy = (BdTuituiService03) Proxy.newProxyInstance(bdTuituiService03.getClass().getClassLoader(), bdTuituiService03.getClass().getInterfaces(), new DynamaticProxy03(bdTuituiService03));
    bdTuituiServiceProxy.process();
  }
}
