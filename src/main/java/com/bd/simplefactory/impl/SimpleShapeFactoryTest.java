package com.bd.simplefactory.impl;

import com.bd.simplefactory.Shape;

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
