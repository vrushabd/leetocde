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
                 temp.add(a.val);
                 if(a.left!=null)
                 q.offer(a.left);
                 if(a.right!=null)
                 q.offer(a.right);
                 }
              l.add(temp);  }
            
          return l;
        }
      
    }
