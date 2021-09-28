package com.collections;

/**
 * @author: Ranlay.su
 * @date: 2021-09-14 9:50
 * @description: 模拟 LinkedList实现
 * @version: 1.0.0
 */
public class MyLinkedList {
    /**
     * 首节点
     */
    Node first;

    /**
     * 尾节点
     */
    Node last;

    /**
     * 链表元素总数
     */
    int size;

    public MyLinkedList() {
    }

    /**
     * 添加元素
     * @param o
     */
    public void add(Object o) {
        Node cur = new Node(o);
        if (null == first) {
            first = last = cur;
        } else {
            cur.setPre(last);
            last.setNext(cur);
            last = cur;
        }
        size ++;
    }

    /**
     * 获取指定索引的元素
     * @param index
     * @return
     */
    public Object get(int index) {
        Node cur = first;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.getItem();
    }

    /**
     * 获取元素总数
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 节点类
     */
    private class Node {
        /**
         * 上一个节点
         */
        Node pre;

        /**
         * 当前节点值
         */
        Object item;

        /**
         * 下一个节点
         */
        Node next;

        public Node(Object o) {
            this.item = o;
        }

        public Node getPre() {
            return pre;
        }

        public void setPre(Node pre) {
            this.pre = pre;
        }

        public Object getItem() {
            return item;
        }

        public void setItem(Object item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

class Test {
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        ml.add("aa");
        ml.add("bb");
        ml.add("cc");

        System.out.println(ml.getSize());
        System.out.println(ml.get(1));
    }
}
