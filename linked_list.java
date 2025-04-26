public class linked_list {
    public static class Node {
        int data;
        Node next;
    }

    public static void main(String[] args) {
        Node head = new Node();
        head.data = 1;
        head.next = new Node();
        head.next.data = 2;
        head.next.next = new Node();
        head.next.next.data = 3;
        head.next.next.next = new Node();
        head.next.next.next.data = 4;
        head.next.next.next.next = new Node();
        head.next.next.next.next.data = 5;
        head.next.next.next.next.next = null;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
