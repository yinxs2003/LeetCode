package com.bd.designpattern.factory.simple.impl;

import com.bd.designpattern.factory.simple.Shape;

/**
 * @author xupeng
 * @date: 05/03/2020
 */
public class SimpleShapeFactoryTest {
  public static void main(String[] args) {
    Shape circle = SimpleShapeFactory.getShape("circle");
    circle.draw();
    Shape square = SimpleShapeFactory.getShape("square");
    square.draw();
  }
}
