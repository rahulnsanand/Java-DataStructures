package com.rahulnsanand.javadatastructures.debug;

import java.util.ArrayList;

public class DebugClass {
    public static void debugThis(){

        ArrayList<String> list = new ArrayList<String>() ;
        list.add( "Ant" );
        list.add( "Bat" );
        list.add( "Car" );
        list.add( "Door" );
        list.add( "Euro" );

        System.out.println();
    }
}
class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}
 class LinkedListUse{

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }

    public static void main(String args[]){

        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        node1.next = node2;
        increment(node1);
        print(node1);
    }
}