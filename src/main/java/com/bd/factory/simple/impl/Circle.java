package com.bd.factory.simple.impl;

import com.bd.factory.simple.Shape;

/**
 * @author xupeng
 * @date: 05/03/2020
 */
public class Circle implements Shape {
  public Circle(){
  }

  public void draw() {
    System.out.println("draw circle");
  }
}
