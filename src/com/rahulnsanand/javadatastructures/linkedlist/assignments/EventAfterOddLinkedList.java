package com.rahulnsanand.javadatastructures.linkedlist.assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EventAfterOddLinkedList {

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

        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode<Integer> head = takeInput();

            LinkedListNode<Integer> newHead = evenAfterOdd(head);
            print(newHead);

            t -= 1;
        }

    }
    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode<Integer> evenStart = null;
        LinkedListNode<Integer> evenEnd = null;
        LinkedListNode<Integer> oddStart = null;
        LinkedListNode<Integer> oddEnd = null;
        LinkedListNode<Integer> currentNode = head;

        while(currentNode != null) {
            int element = currentNode.data;

            if(element % 2 == 0) {

                if(evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = currentNode;
                    evenEnd = evenEnd.next;
                }

            } else {

                if(oddStart == null) {
                    oddStart = currentNode;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = currentNode;
                    oddEnd = oddEnd.next;
                }
            }
            currentNode = currentNode.next;
        }


        if(oddStart == null || evenStart == null) {
            return head;
        }

        oddEnd.next = evenStart;
        evenEnd.next = null;
        head=oddStart;

        return head;
    }
}
