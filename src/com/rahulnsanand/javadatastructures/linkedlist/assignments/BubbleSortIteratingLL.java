package com.rahulnsanand.javadatastructures.linkedlist.assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSortIteratingLL {


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }

    public static void print(LinkedListNode<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void run() throws NumberFormatException, IOException {
        LinkedListNode<Integer> head = takeInput();

        head = bubbleSort(head);
        print(head);
    }

    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        //Your code goes here
        if (head != null) {
            LinkedListNode<Integer> current = null,
                    new_head = null,
                    move_node = null,
                    prev = null;
            while (head != null) {

                prev = null;
                current = head;
                move_node = head;

                while (current != null) {

                    if (current.next != null && current.next.data > move_node.data) {
                        move_node = current.next;
                        prev = current;
                    }

                    current = current.next;

                }

                if (move_node == head) {
                    head = (head).next;
                }

                if (prev != null) {
                    prev.next = move_node.next;
                }

                move_node.next = new_head;
                new_head = move_node;
            }
            head = new_head;
            return head;
        } else {
            return null;
        }
    }
}
