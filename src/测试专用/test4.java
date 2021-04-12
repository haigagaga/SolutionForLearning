package 测试专用;

import java.util.HashMap;
import java.util.Map;

public class test4 {
    public static void main(String[] args) {


        Node node1= new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node temp = new test4().reverseLinkedList(node1);
        while(temp !=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }



    public Node reverseLinkedList(Node head) {
        // 返回逆序以后的链表头
        if (head == null || head.next ==null) return head;
        Node temp = head.next;
        Node newHead = reverseLinkedList(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }

    static class Node {
        Object value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }


}
