package com.bd.simplefactory.impl;

import com.bd.simplefactory.Shape;

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
