package com.bd.proxy.statics2.proxy;

import com.bd.proxy.statics2.TuituiService;
import com.bd.proxy.statics2.impl.TuituiServiceImpl;

/**
 * @author xupeng
 * @date: 09/03/2020
 */
public class TuituiServiceProxy implements TuituiService {
  private TuituiService tuituiService;

  @Override
  public void processData() {

    if(tuituiService == null){
      tuituiService = new TuituiServiceImpl();
    }

    System.out.println("before calling processData()");
    tuituiService.processData();
    System.out.println("after calling processData()");
  }
}
