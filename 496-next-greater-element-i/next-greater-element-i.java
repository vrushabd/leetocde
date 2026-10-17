class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      Map<Integer,Integer> m = new HashMap<>();
      int arr[] = new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            m.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++){
           int n=m.get(nums1[i]);
           int j = n;
           while(j!=nums2.length){
         if(j!=nums2.length-1 && nums2[n]<nums2[j+1]){
               arr[i] = nums2[j+1];
               break;
         }
         else{
            arr[i] = -1;
         }
         j++;
           }

      

    
}
    return arr;
}
}