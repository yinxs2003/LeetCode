package com.bd.factory.method.factory.impl;

import com.bd.factory.method.factory.ReaderFactory;
import com.bd.factory.method.reader.Reader;
import com.bd.factory.method.reader.impl.GifReader;

/**
 * @author xupeng
 * @date: 05/03/2020
 */
public class GifReaderFactory implements ReaderFactory {
  public Reader getReader() {
    return new GifReader();
  }
}
