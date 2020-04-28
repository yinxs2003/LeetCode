package com.bd.designpattern.proxy.statics2.impl;

import com.bd.designpattern.proxy.statics2.TuituiService;

/**
 * @author xupeng
 * @date: 09/03/2020
 */
public class TuituiServiceImpl implements TuituiService {
  @Override
  public void processData() {
    System.out.println("Real processData");
  }
}
