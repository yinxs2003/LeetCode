package com.bd.designpattern.factory.method.factory.impl;

import com.bd.designpattern.factory.method.factory.ReaderFactory;
import com.bd.designpattern.factory.method.reader.Reader;
import com.bd.designpattern.factory.method.reader.impl.PngReader;

/**
 * @author xupeng
 * @date: 05/03/2020
 */
public class PngReaderFactory implements ReaderFactory {
  public Reader getReader() {
    return new PngReader();
  }
}
