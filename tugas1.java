// jawaban nomor 1
int jumlahBaris;

// jawaban nomor 2
String kalimatBaru = "Deklarasi tipe data String";

// jawaban nomor 3
int[] empatAngka = {7, 10, 20, 23};

// jawaban nomor 4
String[][] alfabet = {
    {"a", "b", "c"},
    {"d", "e", "f"},
    {"g", "h", "i"}
};

// jawaban nomor 5
class Node {
    int data;
    Node next;

public Node(int data) {
    this.data = data;
    this.next = null;
}
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
        }
        System.out.println();
    }
}`

LinkedList listAngka = new LinkedList();
listAngka.addFirst(26);
listAngka.addFirst(8);
listAngka.addFirst(23);
listAngka.addFirst(24);
listAngka.addFirst(16);

listAngka.displayList();