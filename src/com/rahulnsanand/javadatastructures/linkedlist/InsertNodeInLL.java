package com.rahulnsanand.javadatastructures.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertNodeInLL {
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
            String[] pos_data = br.readLine().trim().split("\\s");

            int pos = Integer.parseInt(pos_data[0]);
            int data = Integer.parseInt(pos_data[1]);

            head = insert(head, pos, data);
            print(head);

            t -= 1;
        }
    }

    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){

        LinkedListNode<Integer> topNode = head;

        if (pos == 0) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            newNode.next = head;
            topNode = newNode;
        } else {
            while (pos-- >= 0) {
                if(head!=null){
                    if (pos == 0) {
                        LinkedListNode<Integer> newNode = GetNode(data);
                        newNode.next = head.next;
                        head.next = newNode;
                        break;
                    }
                    head = head.next;
                }
            }
        }
        return topNode;
    }

    static LinkedListNode<Integer> GetNode(int data) {
        return new LinkedListNode<>(data);
    }
}
