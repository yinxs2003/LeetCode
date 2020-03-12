package com.bd.util;

import java.util.Iterator;

/**
 * @author xupeng
 * @date: 12/03/2020
 */
public class MyQueue<Item> implements Iterable<Item> {
  private Node first;
  private Node last;
  private int N;

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

  public int size() {
    return N;
  }

  public void enqueue(Item item) {
    if (N == 0) {
      last = new Node();
      last.data = item;
      first = last;
    } else {
      Node oldLast = last;
      last = new Node();
      last.data = item;
      oldLast.next = last;
    }
    N++;
  }

  public static void main(String[] args) {
    MyQueue<Integer> queue = new MyQueue();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(3);



    for(Integer num : queue){
      System.out.println(num);
    }
  }
}

