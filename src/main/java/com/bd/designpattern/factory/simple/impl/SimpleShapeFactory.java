package com.bd.designpattern.factory.simple.impl;

import com.bd.designpattern.factory.simple.Shape;

/**
 * @author xupeng
 * @date: 05/03/2020
 * <p>
 * 　　在这个工厂类中通过传入不同的type可以new不同的形状，返回结果为Shape 类型，这个就是简单工厂核心的地方了。
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
