package 测试专用;

public class test3 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node11 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node33 = new ListNode(4);
        node11.next = node22;
        node22.next = node33;
        ListNode resut = new test3().addTwoNumbers(node1, node11);
        ListNode temp = resut;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = null;
        ListNode current = null;
        ListNode temp1 = reverseNode(l1);
        String c1 = "";
        while (temp1 != null) {
            c1 += temp1.val;
            temp1 = temp1.next;
        }
        ListNode temp2 = reverseNode(l2);
        String c2 = "";
        while (temp2 != null) {
            c2 += temp2.val;
            temp2 = temp2.next;
        }
        int result = Integer.valueOf(c1) + Integer.valueOf(c2);
        char[] chars = String.valueOf(result).toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (resultNode == null) {
                resultNode = new ListNode(Integer.valueOf(new String(chars[i]+"")));
                current = resultNode;
            } else {
                current.next = new ListNode(Integer.valueOf(new String(chars[i]+"")));
                current = current.next;
            }
        }
        return resultNode;
    }

    public ListNode reverseNode(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = head.next;
        ListNode newhead = reverseNode(head.next);
        temp.next = head;
        head.next = null;
        return newhead;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
