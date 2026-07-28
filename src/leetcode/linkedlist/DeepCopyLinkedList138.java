package leetcode.linkedlist;

public class DeepCopyLinkedList138 {
    public static void main(String[] args) {

        Node node = new Node(1);
        Node node2 = new Node(2, node, null);
        Node node3 = new Node(3, node2, null);
        Node node4 = new Node(4, node3, null);
        Node head = new Node(5, node4, null);

        System.out.println(head);
        System.out.println(copyRandomList(head));

    }

    public static Node copyRandomList(Node head) {


        return null;
    }
}

class Node {

    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public Node(int val, Node next, Node random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }

    @Override
    public String toString() {
        return "Node{" + val + " " + next + " " + random + "}";
    }
}
