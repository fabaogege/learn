package exercise;

public class MinimumDepthOfBinaryTree {
	public int minDepth(TreeNode root) {
		if(root == null){
            return 0;
        }
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if(l == 0){
            if(r == 0){
                return 1;
            }else{
                return r+1;
            }
        }
        if(r == 0){
            if(l == 0){
                return 1;
            }else{
                return l+1;
            }
        }
        return Math.min(l,r)+1;
	}
}
