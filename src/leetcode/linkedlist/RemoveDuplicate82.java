package leetcode.linkedlist;

public class RemoveDuplicate82 {
    public static void main(String[] args) {

        ListNode node6 = new ListNode(5, null);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);

        System.out.println(deleteDuplicates(head));

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, null);
        ListNode prev = dummy;

        dummy.next = head;
        ListNode curr = head;

        while (curr != null) {

            if (curr.next != null && curr.data == curr.next.data) {
                while (curr.next != null && curr.data == curr.next.data) {
                    curr = curr.next;
                }
                prev.next = curr.next;
            } else {
                prev = curr;
            }

            curr = curr.next;
        }
        return head;
    }

}
