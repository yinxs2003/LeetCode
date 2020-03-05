package com.bd.simplefactory.impl;

import com.bd.simplefactory.Shape;

/**
 * @author xupeng
 * @date: 05/03/2020
 */
public class SimpleShapeFactory {

  public static Shape getShape(String type) {
    if (type.equalsIgnoreCase("circle")) {
      return new Circle();
    } else if (type.equalsIgnoreCase("square")) {
      return new Square();
    }
    return null;
  }
}
