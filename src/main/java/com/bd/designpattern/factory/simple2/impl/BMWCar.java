package com.bd.designpattern.factory.simple2.impl;

import com.bd.designpattern.factory.simple2.Car;

/**
 * @author xupeng
 * @date: 23/03/2020
 */
public class BMWCar implements Car {
  @Override
  public void call() {
    System.out.println("BMW Car");
  }
}
