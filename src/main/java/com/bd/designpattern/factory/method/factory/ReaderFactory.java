package com.bd.designpattern.factory.method.factory;

import com.bd.designpattern.factory.method.reader.Reader;

/**
 * @author xupeng
 * @date: 05/03/2020
 * <p>
 * （1）客户端不需要知道它所创建的对象的类。例子中我们不知道每个图片加载器具体叫什么名，只知道创建它的工厂名就完成了床架过程。
 *  (2）客户端可以通过子类来指定创建对应的对象。
 */
public interface ReaderFactory {
  Reader getReader();
}
