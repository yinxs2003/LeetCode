package com.bd.datastruct.nodelist;

import java.util.Iterator;

/**
 * @author xupeng
 * @date: 12/03/2020
 * <p>
 * 链表
 */
public class NodeList<Item> implements Iterable<Item> {
  private Node first;
  private int N;

  public void addFromHead(Item item) {
    Node oldFirst = first;
    first = new Node();
    first.data = item;
    first.next = oldFirst;
    N++;
  }

  public void deleteFromHead() {
    first = first.next;
    N--;
  }

  public void printAll() {
    for (Node i = first; i != null; i = i.next) {
      System.out.print(i.data + " ");
    }
  }

  public int size() {
    return N;
  }

  @Override
  public Iterator<Item> iterator() {
    return new Iterator<Item>() {
      Node current = first;

      @Override
      public void remove() {
      }

      @Override
      public boolean hasNext() {
        return current != null;
      }

      @Override
      public Item next() {
        Item item = current.data;
        current = current.next;
        return item;
      }
    };
  }


  private class Node {
    Item data;
    Node next;
  }


  public static void main(String[] args) {
    NodeList<String> nodeList = new NodeList<String>();
    nodeList.addFromHead("abc");
    nodeList.addFromHead("abc");
    nodeList.addFromHead("efg");
    nodeList.addFromHead("1");

    nodeList.deleteFromHead();

    for (String item : nodeList) {
      System.out.println(item);
    }
  }
}
