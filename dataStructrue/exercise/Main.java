package exercise;

public class Main {
    public static void main(String[] args){
       TreeNode t = new TreeNode(3);
       TreeNode t2 = new TreeNode(5);
       t.left = t2;
       MinimumDepthOfBinaryTree m = new MinimumDepthOfBinaryTree();
       System.out.println(m.minDepth(t));
    }
}

