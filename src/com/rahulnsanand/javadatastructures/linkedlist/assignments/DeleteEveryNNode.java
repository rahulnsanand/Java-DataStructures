package com.rahulnsanand.javadatastructures.linkedlist.assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteEveryNNode {

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
            String[] m_n = br.readLine().trim().split("\\s");

            int m = Integer.parseInt(m_n[0]);
            int n = Integer.parseInt(m_n[1]);

            LinkedListNode<Integer> newHead = skipMdeleteN(head, m, n);
            print(newHead);

            t -= 1;
        }

    }
    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        //Your code goes here
        LinkedListNode<Integer> curr = head, t;
        int count;

        if(M==0){
            return null;
        }

        while (curr!=null) {
            for (count = 1; count < M && curr != null; count++){
                curr = curr.next;
            }
            if (curr == null) {
                return head;
            }
            t = curr.next;
            for (count = 1; count <= N && t != null; count++) {
                LinkedListNode<Integer> temp = t;
                t = t.next;
            }
            curr.next = t;
            curr = t;
        }

        return head;
    }
}
