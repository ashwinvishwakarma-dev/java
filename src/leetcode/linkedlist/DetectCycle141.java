package leetcode.linkedlist;

public class DetectCycle141 {
    public static void main(String[] args) {

        ListNode head = new ListNode(5, null);
        ListNode node1 = new ListNode(10, null);
        ListNode node2 = new ListNode(20, null);
        ListNode node3 = new ListNode(30, null);
        ListNode node4 = new ListNode(40, null);

//      Connect Node
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

//      Loop
        node4.next = node2;

        System.out.println(hasCycle(head));

    }

    public static boolean hasCycle(ListNode head) {

        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode != null && fastNode.next != null) {

            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            if (slowNode == fastNode) {
                return true;
            }
        }
        return false;
    }
}

class ListNode {
    int data;
    ListNode next;

    ListNode() {
        ;
    }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" + "data= " + data + ", next=" + next + '}';
    }
}
