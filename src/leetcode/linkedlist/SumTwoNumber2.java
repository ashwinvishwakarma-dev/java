package leetcode.linkedlist;

public class SumTwoNumber2 {
    public static void main(String[] args) {
        ListNode2 node2 = new ListNode2(3, null);
        ListNode2 node1 = new ListNode2(4, node2);
        ListNode2 head1 = new ListNode2(0, node1);

        ListNode2 node4 = new ListNode2(4, null);
        ListNode2 node3 = new ListNode2(6, node4);
        ListNode2 head2 = new ListNode2(0, node3);

        System.out.println(addTwoNumbers(head1, head2));

    }

        public static ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
            ListNode2 head = new ListNode2();
            ListNode2 temp = head;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0) {

                int x = (l1 != null) ? l1.data : 0;
                int y = (l2 != null) ? l2.data : 0;

                int sum = x + y + carry;

                carry = sum / 10;
                int rem = sum % 10;
                head.next = new ListNode2(rem, null);
                head = head.next;

                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }

            return temp.next;
        }
    }

class ListNode2 {

    int data;
    ListNode2 next;

    ListNode2() {
    }

    ListNode2(int data, ListNode2 next) {
        this.data = data;
        this.next = next;
    }

}
