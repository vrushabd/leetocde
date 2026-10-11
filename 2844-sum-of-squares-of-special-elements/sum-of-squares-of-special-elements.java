class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sq = 0;
        for(int i = 0;i<n;i++){
            if(n%(i+1)==0){
               sq = sq + nums[i] * nums[i];
            }
        }
        return sq;
    }
}