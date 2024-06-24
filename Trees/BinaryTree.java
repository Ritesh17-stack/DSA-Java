package Trees;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree() {

    }

    private static class Node {
        Node left;
        Node right;
        int val;

        public Node(int val) {
            this.val = val;
        }

    }

    private Node root;

    //     Inserting elements
    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node.");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.val);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left node.");
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter right of " + node.val);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right node.");
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }
    }
    public void display(){
        display(root,0);
    }
    private void display(Node node,int level){
        if (node==null){
            return;
        }
        display(node.right,level+1);
        if (level!=0){
            for (int i =0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("----->"+node.val);
        }
        else {
            System.out.println(node.val);
        }
        display(node.left,level+1);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void  inOrder(Node node){
        if (node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.val);
        inOrder(node.right);
    }
}

