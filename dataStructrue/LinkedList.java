package dataStructrue;

import java.security.PublicKey;

/**
 * Created by lzp on 2018/11/7.
 */
public class LinkedList<E> {

    //内部类
    private class Node{
        public E e;
        public  Node next;
        public Node(E e,Node next){
            this.e = e;
            this.next = next;
        }
        public Node(E e){
            this(e,null);
        }
        public Node(){
            this(null,null);
        }
        public String toSring(){
            return  e.toString();
        }
    }
    private Node head;
    int size;
    public LinkedList(){
        head=null;
        size=0;
    }

    /**
     *
     * @return int
     */
    public int getSize(){
        return size;
    }

    /**
     *
     * @return boolean
     */
    public  boolean isEmpty(){
        return  size ==0;
    }



}
