package 测试专用;

public class test2 {

    private static Node head;
    private static Node current;

    public static void main(String[] args) {
        test2 test2 = new test2();
//        test2.createNode(5);
//        head = test2.reverseNode(head);
//        Node temp = head;
//        while(temp !=null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
        int[] nums = {2, 7, 11, 15};
        int[] result = test2.twoSum(nums , 9);
        for (int a :
                result) {
            System.out.println(a);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (target - nums[i] == nums[j] && nums[i] != nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public void createNode(int length) {
        for (int i = 0; i < length; i++) {
            if (head == null) {
                head = new Node(i);
                current = head;
            } else {
                current.next = new Node(i);
                current = current.next;
            }
        }
    }

    public Node reverseNode(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node temp = node.next;
        Node newHead = reverseNode(node.next);
        temp.next = node;
        node.next = null;
        return newHead;
    }

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


}
