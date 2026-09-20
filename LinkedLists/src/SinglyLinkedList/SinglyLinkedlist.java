package SinglyLinkedList;

public class SinglyLinkedlist {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }
    public void PrintList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data + "  ->  ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }


    public static void main(String [] args){
        SinglyLinkedlist list = new SinglyLinkedlist();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        list.PrintList();
    }
}
