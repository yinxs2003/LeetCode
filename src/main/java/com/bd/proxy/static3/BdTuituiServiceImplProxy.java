package com.bd.proxy.static3;

/**
 * @author xupeng
 * @date: 20/03/2020
 */
public class BdTuituiServiceImplProxy implements BdTuituiService {
  private BdTuituiService tuituiService;

  @Override
  public void request() {
    if (tuituiService == null) {
      tuituiService = new BdTuituiServiceImpl();
    }

    System.out.println("before");
    tuituiService.request();
    System.out.println("after");

  }
}
