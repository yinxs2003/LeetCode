package com.bd.proxy.static3;

/**
 * @author xupeng
 * @date: 20/03/2020
 */
public class Solution {
  public static void main(String[] args) {
    BdTuituiService tuituiService = new BdTuituiServiceImplProxy();
    tuituiService.request();
  }
}
