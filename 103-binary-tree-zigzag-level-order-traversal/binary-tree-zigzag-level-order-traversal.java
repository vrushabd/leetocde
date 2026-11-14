/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue <TreeNode> q = new LinkedList<>();
        List<List<Integer>> l = new ArrayList<>();
        q.offer(root);
        int level = -1;
        if(root == null){
            return l;
        }
        while(!q.isEmpty()){
             List<Integer> temp = new ArrayList<>();
            
             int size = q.size();
             for(int i=0;i<size;i++){
                TreeNode a = q.poll();
                temp.add(a.val);
                if(a.left!=null){
                    q.offer(a.left);

                }
                if(a.right!=null){
                    q.offer(a.right);
                }

             } 
             level++;
             if(level%2!=0){
                Collections.reverse(temp);
                l.add(temp);
             }
             else{
                l.add(temp);
             }

        }
return l;
    }
}