package com.rahulnsanand.javadatastructures.linkedlist.assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapTwoNodesOfLL {


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
            String[] i_j = br.readLine().trim().split("\\s");

            int i = Integer.parseInt(i_j[0]);
            int j = Integer.parseInt(i_j[1]);

            LinkedListNode<Integer> newHead = swapNodes(head, i, j);
            print(newHead);

            t -= 1;
        }

    }
    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
        //Your code goes here

        if (i == j) {
            return head;
        }

        int firstElement = get(i, head);
        int secondElement = get(j, head);

        set(i, secondElement, head);
        set(j, firstElement, head);

        return head;
    }

    public static int get(int index, LinkedListNode<Integer> head) {
        int i = 0;
        LinkedListNode<Integer> tempNode = head;
        while (i < index) {
            tempNode = tempNode.next;
            i++;
        }
        return tempNode.data;
    }

    public static void set(int index, int element, LinkedListNode<Integer> head) {
        int i = 0;
        LinkedListNode<Integer> tempNode = head;
        while (i < index) {
            tempNode = tempNode.next;
            i++;
        }
        tempNode.data = element;
    }
}
