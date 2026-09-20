import java.util.LinkedList;

public class LL1 {
    Node head;
    class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
           head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //PrintList
    public void PrintList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    //DeleteFirst
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    //delete Last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;


            }
        if(head.next == null){
            head = null;
            return;
        }
        Node SecondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            SecondLast = SecondLast.next;
        }
        SecondLast.next = null;
    }


    public static void main(String[] args) {
       LL1 list = new LL1();
       list.addFirst(10);
       list.addFirst(20);
       list.addFirst(30);

       list.PrintList();

       list.addLast(50);
       list.PrintList();

       list.addLast(60);
       list.PrintList();

       list.deleteFirst();
       list.PrintList();

       list.deleteLast();
       list.PrintList();
    }
}
