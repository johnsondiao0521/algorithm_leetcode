package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//leetcode 102;给你二叉树的根节点 root ，返回其节点值的 层序遍历
public class Solution_102 {

    public List<List<Integer>> levelOrder(TreeNode root){

        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;

        //将根节点压入队列
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i=0; i<n; i++){
                TreeNode cur = q.remove();
                list.add(cur.val);

                if(cur.left != null)
                    q.add(cur.left);
                if(cur.right != null)
                    q.add(cur.right);
            }
            res.add(list);
        }

        return res;
    }

}
