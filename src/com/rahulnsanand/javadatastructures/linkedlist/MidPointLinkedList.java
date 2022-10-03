package com.rahulnsanand.javadatastructures.linkedlist;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MidPointLinkedList {

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

            LinkedListNode<Integer> mid = midPoint(head);

            if (mid != null) {
                System.out.println(mid.data);
            }

            t -= 1;
        }

    }
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here

        if(head==null || head.next==null){
            return head;
        } else {
            int length = getLen(head);
            LinkedListNode<Integer> temp = head;

            double middleLength = Math.floor(length / 2);

            if(length % 2 == 0){
                middleLength--;
            }

            while (middleLength != 0) {
                temp = temp.next;
                middleLength--;
            }
            return temp;
        }

    }

    public static int getLen(LinkedListNode<Integer> head) {
        int length = 0;
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

}
