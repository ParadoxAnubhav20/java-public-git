public class DoublyLinkedList {
    private Node head;

    DoublyLinkedList() {
        head = null;
    }

    public void addFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    
    

    public void display() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    
public void insertAtPosition(int val, int position) {
    Node newNode = new Node(val);
    if (position == 0) {
        // Inserting at the beginning
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    } else {
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            // Inserting at the end
            temp.next = newNode;
            newNode.prev = temp;
        } else {
            // Inserting in the middle
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
}

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.display();
        dl.addFirst(5);
        dl.addFirst(3);
        dl.addFirst(7);
        dl.addLast(12);
        dl.addLast(14);
        dl.display();
        dl.insertAtPosition(69, 3);
        dl.display();
    }
}

class Node {
    int val;
    Node prev, next;

    Node(int val) {
        this.val = val;
        this.prev = null;  // Fixed this line
        this.next = null;
    }
}



