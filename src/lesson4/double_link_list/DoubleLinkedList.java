package lesson4.double_link_list;

import lesson4.list.LinkedList;

public interface DoubleLinkedList extends LinkedList {

    void insertLast(String name, int age);

    boolean isFind(String name);

}
