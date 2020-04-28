package com.bd.designpattern.factory.method.reader.impl;

import com.bd.designpattern.factory.method.reader.Reader;

/**
 * @author xupeng
 * @date: 05/03/2020
 */
public class GifReader implements Reader {
  public void read() {
    System.out.println("Read gif");
  }
}
