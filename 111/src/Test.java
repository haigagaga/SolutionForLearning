public class Test {
    public static void main(String[] args) {

        Node node1 = new Node(0);
        Node node2 = new Node(1);
        Node node3 = new Node(2);
        Node node4 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        Node orignal = node1;
        Node reversNode = reverse(node1);
        Node temp = orignal;
        int index = 0;
        while(temp!=null){
            index++;
            temp = temp.next;
            while(reversNode !=null){

            }
        }


    }

    public static Node reverse(Node head){
        if (head == null || head.next == null)  return head;
        Node temp = head.next;
        Node newNead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newNead;
    }

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }


}
