package TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 给定二叉搜索树的根节点root,返回L和R（含）之间的所有结点的值的和
 * 二叉搜索树保证具有唯一的值
 * @author：Wen
 * @version：1.0
 * @date：2021/4/27 11:06
 * @copyright 老九学堂
 * @remark TODO
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    int Low;
    int High;
    int ans;

    TreeNode(){}

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    //递归 - 时间复杂度O（n）,空间复杂度O（n）
//    public int rangeSumBST(TreeNode root, int low, int high){
//        Low = low;
//        High = high;
//        dfs(root);
//        return ans;
//    }
//
//    public void dfs(TreeNode root){
//        if (root == null){
//            return;
//        }
//        dfs(root.left);
//        if (Low <= root.val && root.val <= High){
//            ans += root.val;
//        }
//        dfs(root.right);
//    }

    //迭代 - 时间复杂度O（n）,空间复杂度O（n）
    public int rangeSumRST(TreeNode root, int low, int high){
        int ans = 0;
        Deque<TreeNode> d = new ArrayDeque<>();
        while (root != null || !d.isEmpty()){
            while (root != null){
                d.addLast(root);
                root = root.left;
            }
            root = d.pollLast();
            if (low <= root.val && root.val <= high){
                ans += root.val;
            }
            root = root.right;
        }
        return ans;
    }
}
