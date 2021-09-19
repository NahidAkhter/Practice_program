package javaDsImplements;

public class TreeMain {

    public static void main(String[] args) {

        Node rootNode = new Node();
        rootNode = new Node(1);
        rootNode.left = new Node(2);
        rootNode.right = new Node(3);
        rootNode.left.left = new Node(4);
        rootNode.right.left = new Node(5);
        rootNode.right.right = new Node(6);
        rootNode.right.right.right = new Node(7);
        rootNode.right.right.right.right = new Node(8);

       // System.out.println(heightOfTree(rootNode));

        traverseTree(rootNode);

    }


    static int heightOfTree(Node node) {
        if(null == node) return 0;

        int levelR=0, levelL = 0;
        if(null != node.right) levelR = heightOfTree(node.right);
        if(null != node.left)  levelL = heightOfTree(node.left);

        return Math.max(levelL, levelR) + 1 ;
    }

    static void traverseTree(Node node){
        if(node != null){
            traverseTree(node.left);
            System.out.print(node.val + " ");
            traverseTree(node.right);
        }

    }
}

class Node {
    int val;
    Node right;
    Node left;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
        this.right = null;
        this.left = null;
    }

}
