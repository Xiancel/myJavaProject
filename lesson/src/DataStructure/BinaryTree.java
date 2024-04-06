package DataStructure;

public class BinaryTree {
    Node root;
    BinaryTree(int key){
        root = new Node(key);
    }

    BinaryTree(){
        root = null;
    }

    public void traverseInOder(Node node){
        if(node != null){
            traverseInOder(node.left);
            System.out.println(" "+ node.key);
            traverseInOder(node.right);
        }
    }

    public void traversePostOder(Node node){
        if(node != null){
            traversePostOder(node.left);
            traversePostOder(node.right);
            System.out.println(" "+ node.key);
        }
    }

    public void traversePreOder(Node node){
        if(node != null){
            System.out.println(" "+ node.key);
            traversePreOder(node.left);
            traversePreOder(node.right);
        }
    }



    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root =new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left= new Node(4);

        System.out.println("pre order");
        tree.traversePreOder(tree.root);

        System.out.println("in order");
        tree.traverseInOder(tree.root);

        System.out.println("post order");
        tree.traversePostOder(tree.root);

    }
}
class Node{
    int key;
    Node left,right;
    public Node(int item){
        key = item;
        left = right = null;
    }
}
