package DoublyLinkedList;

public class DDL2 {
    Node head;
    Node tail;

    class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteLast(){
        if(tail == null){
            System.out.println("List is empty");
            return;
        } else if(head == tail){
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void PrintList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

public static void main(String [] args){
      DDL2 Dlist = new DDL2();

      Dlist.addFirst(10);
      Dlist.PrintList();

      Dlist.addLast(20);
      Dlist.addLast(30);
      Dlist.addLast(40);
      Dlist.addLast(50);
      Dlist.PrintList();


      Dlist.deleteFirst();
      Dlist.PrintList();

      Dlist.deleteLast();
      Dlist.PrintList();


}
}
