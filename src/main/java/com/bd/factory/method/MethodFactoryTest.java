package com.bd.factory.method;

import com.bd.factory.method.factory.ReaderFactory;
import com.bd.factory.method.factory.impl.GifReaderFactory;
import com.bd.factory.method.factory.impl.PngReaderFactory;
import com.bd.factory.method.reader.Reader;

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
