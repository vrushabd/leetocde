class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int i = 0;
        int j = 1 ;

       while(j<nums.length){
         if(nums[i]+nums[j]==target){
            arr[0] = i;
            arr[1] = j;
            return arr;
         }
         if(j==nums.length-1){
         
            i++;
             j=i+1; 
               if(i==nums.length-1){
           
           break;
         }
         }
         else{
            j++;
         }
          
         
          
       }
       return null;
    }

}