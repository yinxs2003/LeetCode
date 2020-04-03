package com.bd.tree;

/**
 * @author xupeng
 * @date: 03/04/2020
 */
public class BST<Key extends Comparable<Key>, Value> {
  private Node root;

  private class Node {
    private Key key;
    private Value val;
    private Node left, right;
    private int N;

    public Node(Key key, Value val, int N) {
      this.key = key;
      this.val = val;
      this.N = N;
    }
  }

  public int size() {
    return size(root);
  }

  private int size(Node x) {
    if (x == null) return 0;
    else return x.N;
  }

  public Value get(Key key) {
    return get(root, key);
  }

  private Value get(Node x, Key key) {
    if (x == null) return null;
    int cmp = key.compareTo(x.key);
    if (cmp < 0) return get(x.left, key);
    else if (cmp > 0) return get(x.right, key);
    else return x.val;
  }

  public void put(Key key, Value val) {
    root = put(root, key, val);
  }

  private Node put(Node x, Key key, Value val) {
    if (x == null) return new Node(key, val, 1);
    int cmp = key.compareTo(x.key);
    if (cmp < 0) x.left = put(x.left, key, val);
    else if (cmp > 0) x.right = put(x.right, key, val);
    else x.val = val;
    x.N = size(x.left) + size(x.right) + 1;
    return x;
  }

  public void print() {
    print(root);
  }

  private void print(Node x) {
    if (x == null) return;
    print(x.left);
    System.out.println(x.key);
    print(x.right);
  }

  public static void main(String[] args) {
    BST bstTree = new BST();
    bstTree.put(1, 1);
    bstTree.put(2, 2);
    bstTree.put(3, 3);
    bstTree.put(4, 4);
    bstTree.print();
    int size = bstTree.size();
    System.out.println(String.format("size:%s", size));

    System.out.println(bstTree.get(3));

  }
}
