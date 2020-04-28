package com.bd.designpattern.factory.simple.impl;

import com.bd.designpattern.factory.simple.Shape;

/**
 * @author xupeng
 * @date: 05/03/2020
 */
public class Square implements Shape {
  public Square(){
  }

  public void draw() {
    System.out.println("draw Square");
  }
}
