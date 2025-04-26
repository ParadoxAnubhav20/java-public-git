public class LinkedList {
    private Node head;

    public LinkedList(){
        head = null;
    }

    public void addFirst(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null) { // Handle the case where the list is empty
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) { // Traverse to the end of the list
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertAtPos(int pos, int data) {
        // Handle invalid positions
        if (pos < 0) {
            throw new IllegalArgumentException("Position cannot be negative");
        }
        // Handle insertion at the beginning of the list
        if (pos == 0) {
            addFirst(data);
            return;
        }
        // Create the new node
        Node newNode = new Node(data);
        // Initialize temp to head
        Node temp = head;
        // Traverse to the node just before the desired position
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            temp = temp.next;
        }
        // Check if the position is out of bounds
        if (temp == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        // Insert the new node
        newNode.next = temp.next;
        temp.next = newNode;
    }


    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("The list is already empty.");
        }
    }

    public void deleteLast() {
        // If the list is empty, there is nothing to delete
        if (head == null) {
            System.out.println("The list is already empty.");
            return;
        }
        // If the list has only one node, remove it
        if (head.next == null) {
            head = null;
            return;
        }
        // Traverse to the second-to-last node
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        // Remove the last node
        temp.next = null;
    }


    public void deletePos(int idx) {
        if (head == null) {
            System.out.println("The list is already empty.");
            return;
        }
        // If the position is zero, delete the first node
        if (idx == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        // Traverse to the node just before the desired position
        for (int i = 0; i < idx - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            temp = temp.next;
        }
        // Check if the next node is null, indicating position is out of bounds
        if (temp.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        // Remove the node at the specified position
        temp.next = temp.next.next;
    }
    
    
    
    

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addFirst(3);
        l.addFirst(5);
        l.addFirst(7);
        l.addLast(9);
        l.addLast(15);
        l.addLast(420);
        l.addFirst(69);
        l.addFirst(250);
        l.insertAtPos(2, 18);
        l.display();
        l.deleteFirst();
        l.display();
        l.deleteLast();
        l.display();
        l.deletePos(2);
        l.display();
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
