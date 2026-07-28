package leetcode.linkedlist;

public class ReverseLinkedList92 {
    public static void main(String[] args) {

        ListNode node4 = new ListNode(5, null);
        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);

        System.out.println(head);
        System.out.println("After Reverse....");
        System.out.println(reverseBetween(head, 2, 4));
        
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy;

        for (int i = 1; i < left; i++) {
            pre = pre.next;

        }

        ListNode curr = pre.next;


        for (int i = 0; i < right - left; i++) {

            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return dummy.next;
    }
}
