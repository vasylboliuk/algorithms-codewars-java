package org.tasks.kyu6.listsmap;
import java.util.function.Function;

/**
 * Created by Dell on 1/3/2017.
 */
public class FunWithListsMap {

    /**
     Implement the method map, which accepts a linked list (head) and a mapping function, and returns a new linked
     list (head) where every element is the result of applying the given mapping method to each element of the original list.
     Make sure you do not modify the original list!
     For example: Given the list: 1 -> 2 -> 3, and the mapping function x => x * 2, map should return 2 -> 4 -> 6
     The linked list is defined as follows:

     class Node<T> {
     public T data;
     public Node<T> next;

     Node(T data, Node next) {
     this.data = data;
     this.next = next;
     }

     Node(T data) {
     this(data, null);
        }
     }
     Note: the list may be null and can hold any type of value.
     */
    static <T, R> Node<R> testMap(Node<T> head, Function<T, R> f) {


        return null;
    }

}

