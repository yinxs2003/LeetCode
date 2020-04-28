package com.bd.designpattern.factory.method;

import com.bd.designpattern.factory.method.factory.ReaderFactory;
import com.bd.designpattern.factory.method.factory.impl.GifReaderFactory;
import com.bd.designpattern.factory.method.factory.impl.PngReaderFactory;
import com.bd.designpattern.factory.method.reader.Reader;

/**
 * @author xupeng
 * @date: 05/03/2020
 */
public class MethodFactoryTest {
  public static void main(String[] args) {
    ReaderFactory factory = new GifReaderFactory();
    Reader gitReader = factory.getReader();
    gitReader.read();

    ReaderFactory pngReaderFactory = new PngReaderFactory();
    Reader pngReader = pngReaderFactory.getReader();
    pngReader.read();
  }
}
