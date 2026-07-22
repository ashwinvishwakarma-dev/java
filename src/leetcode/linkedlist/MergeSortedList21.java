package leetcode.linkedlist;

public class MergeSortedList21 {
    public static void main(String[] args) {

        ListNode1 node2 = new ListNode1(20, null);
        ListNode1 node1 = new ListNode1(10, node2);
        ListNode1 head = new ListNode1(5, node1);

        ListNode1 node4 = new ListNode1(50, null);
        ListNode1 node3 = new ListNode1(40, node4);
        ListNode1 head1 = new ListNode1(30, node3);

        ListNode1 mergedSortedList = mergeSortedList(head, head1);

        // Print merged list
        printList(mergedSortedList);
    }

    private static ListNode1 mergeSortedList(ListNode1 head1, ListNode1 head2) {

        ListNode1 temp = new ListNode1(-1, null);
        ListNode1 current = temp;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if (head1 != null) {
            current.next = head1;

        } else {
            current.next = head2;
        }

        return temp.next;
    }

    public static void printList(ListNode1 head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
    }
}

class ListNode1 {
    int data;
    ListNode1 next;


    ListNode1(int data, ListNode1 next) {
        this.data = data;
        this.next = next;
    }
}
