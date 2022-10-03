package com.rahulnsanand.javadatastructures.linkedlist;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSortLL {

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

    public static void print(LinkedListNode<Integer> head) {
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

            LinkedListNode<Integer> newHead = mergeSort(head);
            print(newHead);

            t -= 1;
        }

    }

    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        //Your code goes here

        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode<Integer> middle = getMiddle(head);
        LinkedListNode<Integer> nextofmiddle = middle.next;

        middle.next = null;

        LinkedListNode<Integer> left = mergeSort(head);

        LinkedListNode<Integer> right = mergeSort(nextofmiddle);

        LinkedListNode<Integer> sortedlist = sortedMerge(left, right);
        return sortedlist;
    }

    public static LinkedListNode<Integer> sortedMerge(LinkedListNode<Integer> a, LinkedListNode<Integer> b)
    {
        LinkedListNode<Integer> result = null;
        if (a == null){
            return b;
        }
        if (b == null){
            return a;
        }

        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    public static LinkedListNode<Integer> getMiddle(LinkedListNode<Integer> head) {
        if (head == null)
            return head;

        LinkedListNode<Integer> slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
