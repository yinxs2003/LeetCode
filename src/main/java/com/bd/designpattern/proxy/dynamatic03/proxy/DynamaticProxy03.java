package com.bd.designpattern.proxy.dynamatic03.proxy;

import com.bd.designpattern.proxy.dynamatic03.BdTuituiService03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xupeng
 * @date: 31/03/2020
 */
public class DynamaticProxy03 implements InvocationHandler {
  private BdTuituiService03 bdTuituiService03;

  public DynamaticProxy03(BdTuituiService03 bdTuituiService03) {
    this.bdTuituiService03 = bdTuituiService03;
  }


  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    return method.invoke(bdTuituiService03, args);
  }
}
