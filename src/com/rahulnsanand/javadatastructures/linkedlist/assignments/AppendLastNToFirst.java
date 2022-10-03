package com.rahulnsanand.javadatastructures.linkedlist.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppendLastNToFirst {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while (i < datas.length && !datas[i].equals("-1")) {
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

            int n = Integer.parseInt(br.readLine().trim());
            head = appendLastNToFirst(head, n);
            print(head);

            t -= 1;
        }

    }

    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        //Your code goes here

        if(n==0){
            return head;
        }

        LinkedListNode<Integer>temp1=head;
        LinkedListNode<Integer>temp2=head;
        int length=LengthIterative(head);
        int i=0;
        while(i<length-n-1) {
            temp1=temp1.next;
            i++;
        }

        if(head!=null){
            head=temp1.next;
            temp1.next=null;
            LinkedListNode<Integer>tempHead=head;

            while(tempHead.next!=null) {
                tempHead=tempHead.next;
            }
            tempHead.next=temp2;
        }

        return head;
    }

    public static int LengthIterative(LinkedListNode<Integer>head){
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    }
}
