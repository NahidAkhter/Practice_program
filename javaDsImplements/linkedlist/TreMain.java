package javaDsImplements.linkedlist;

public class TreMain {

    public static void main(String[] args) {

        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2);
        rootNode.right = new TreeNode(3);
        rootNode.right.right = new TreeNode(4);
        rootNode.right.right.right = new TreeNode(5);


        System.out.println(heightOfTree(rootNode));
      //  traverseTree(rootNode);
    }

    static void traverseTree(TreeNode node){
        if(null != node){
            traverseTree(node.left);
            System.out.print(node.value + " ");
            traverseTree(node.right);
        }
    }

    static int heightOfTree(TreeNode node){

        if(null == node) return 0;
        int levelL =0, levelR=0;

        if(null != node.right)
            levelR = heightOfTree(node.right);

        if(null != node.left)
            levelL = heightOfTree(node.left);

        int maxHeight = Math.max(levelL, levelR);

        return maxHeight + 1;
    }

}

class TreeNode {

    int value;
    TreeNode right;
    TreeNode left;

    public TreeNode(int aValue){
        value = aValue;
        right = null;
        left = null;
    }
}