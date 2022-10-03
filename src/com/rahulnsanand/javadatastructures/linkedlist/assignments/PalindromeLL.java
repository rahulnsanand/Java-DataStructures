package com.rahulnsanand.javadatastructures.linkedlist.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeLL {


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

            boolean ans = isPalindrome(head);
            System.out.println(ans);

            t -= 1;

        }

    }

    static LinkedListNode<Integer> head;
    static LinkedListNode<Integer> left;

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head==null || head.next==null){
            return true;
        }

        int size = length(head);

        LinkedListNode<Integer> current = head;
        boolean flag = true;

        int mid = (size%2 == 0)? (size/2) : ((size+1)/2);

        for(int i=1; i<mid; i++){
            current = current.next;
        }

        LinkedListNode<Integer> revHead = reverseList(current.next);

        while(head != null && revHead != null){
            if(head.data != revHead.data){
                flag = false;
                break;
            }
            head = head.next;
            revHead = revHead.next;
        }

        return flag;

    }

    public static LinkedListNode<Integer> reverseList(LinkedListNode<Integer> temp){
        LinkedListNode<Integer> current = temp;
        LinkedListNode<Integer> prevNode = null, nextNode = null;

        while(current != null){
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        return prevNode;
    }

    public static int length(LinkedListNode<Integer> head){
        //Your code goes here
        int lengthCounter = 1;
        if(head==null){
            return 0;
        }

        while(head.next!=null){
            lengthCounter++;
            head = head.next;
        }

        return lengthCounter;
    }
}
