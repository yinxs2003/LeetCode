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
    return get(root, key).val;
  }

  private Node get(Node x, Key key) {
    if (x == null) return null;
    int cmp = key.compareTo(x.key);
    if (cmp < 0) return get(x.left, key);
    else if (cmp > 0) return get(x.right, key);
    else return x;
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
    System.out.print(x.key + " ");
    print(x.right);
  }

  public Key min() {
    return min(root).key;
  }

  private Node min(Node x) {
    if (x.left == null) return x;
    return min(x.left);
  }

  public Key max() {
    return max(root).key;
  }

  private Node max(Node x) {
    if (x.right == null) return x;
    return max(x.right);
  }

  public Key floor(Key key) {

    Node t = floor(root, key);
    if (t == null) return null;
    return t.key;
  }

  private Node floor(Node x, Key key) {
    if (x == null) return null;
    int cmp = key.compareTo(x.key);
    if (cmp < 0) return x.left;
    else if (cmp == 0) return x;
    else {
      Node t = floor(x.right, key);
      if (t != null) return t;
      return x;
    }
  }

  public Key ceiling(Key key) {
    return ceiling(root, key).key;
  }

  private Node ceiling(Node x, Key key) {
    if (x == null) return null;
    int cmp = key.compareTo(x.key);
    if (cmp > 0) return x.right;
    else if (cmp == 0) return x;
    else {
      Node t = ceiling(x.left, key);
      if (t != null) return t;
      return x;
    }
  }

  public static void main(String[] args) {
    BST bstTree = new BST();
    bstTree.put(1, 1);
    bstTree.put(3, 3);
    bstTree.put(4, 3);

    bstTree.put(11, -4);
    bstTree.put(6, -4);
    bstTree.put(2, 2);

    bstTree.print();
    int size = bstTree.size();
    System.out.println(String.format("size:%s", size));

    System.out.println(bstTree.get(2));
    System.out.println(bstTree.min());
    System.out.println(bstTree.max());

    System.out.println(bstTree.floor(2));

    System.out.println(String.format("ceiling:%s", bstTree.ceiling(3)));
  }
}
