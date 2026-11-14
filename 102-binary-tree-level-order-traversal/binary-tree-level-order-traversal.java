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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();   
        List<List<Integer>> l = new ArrayList<>(); 
        if(root == null){
            return l;
        }
        q.offer(root);    
        while(!q.isEmpty()){
            int curSize = q.size();  
            List<Integer> temp = new ArrayList<>(curSize);
            for(int i=0;i<curSize;i++){
                 TreeNode a = q.poll();
                 if(a!=null){
                 temp.add(a.val);
                 q.offer(a.left);
                 q.offer(a.right);
                 }
            }
            if(!temp.isEmpty())
            l.add(temp);
        }
        return l;
    }
}