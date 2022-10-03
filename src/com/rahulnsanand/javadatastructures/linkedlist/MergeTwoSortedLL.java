package com.rahulnsanand.javadatastructures.linkedlist;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeTwoSortedLL {
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

            LinkedListNode<Integer> head1 = takeInput();
            LinkedListNode<Integer> head2 = takeInput();

            LinkedListNode<Integer> newHead = mergeTwoSortedLinkedLists(head1, head2);
            print(newHead);

            t -= 1;
        }

    }
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> headA, LinkedListNode<Integer> headB) {
        //Your code goes here

        LinkedListNode<Integer> dummyNode = new LinkedListNode<Integer>(0);
        LinkedListNode<Integer> tail = dummyNode;

        while(true)  {

            if(headA == null) {
                tail.next = headB;
                break;
            }
            if(headB == null) {
                tail.next = headA;
                break;
            }

            if(headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            }
            else {
                tail.next = headB;
                headB = headB.next;
            }

            tail = tail.next;
        }
        return dummyNode.next;
    }

}
