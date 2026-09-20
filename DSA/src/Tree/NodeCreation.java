package Tree;

public class NodeCreation {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;;
            this.right = null;
        }
    }
    public static void printTree(Node root){
        if(root == null){
            return;
        }
        printTree(root.left);
        printTree(root.right);
        System.out.print(root.data + " ");

    }


    public static void main(String [] args){
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        printTree(root);
    }
}