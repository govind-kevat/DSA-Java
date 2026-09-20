package DoublyLinkedList;

public class DLL {
   public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head){
       Node temp = head;
       while(temp != null){
           System.out.print(temp.data + " -> ");
           temp = temp.next;
       }
        System.out.println();
    }

    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void display2(Node random){
        Node temp = random;
        //Move this temp backwords to the head
        while(temp.prev != null){
            temp = temp.prev;
        }

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL doubly = new DLL();

        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(7);
        Node e = new Node(8);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

//        display(a);
//        displayrev(e);
        display2(e);



    }
}
