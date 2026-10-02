class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
           HashSet<Integer> s = new HashSet<>();
           HashSet<Integer> arr = new HashSet<>();
          for(int i=0;i<nums1.length;i++){
            s.add(nums1[i]);
          } 
        for(int i=0;i<nums2.length;i++){
            if(s.contains(nums2[i]) && !arr.contains(nums2[i]) ){
             arr.add(nums2[i]);
            }
        }
       return arr.stream().mapToInt(Integer::intValue).toArray();  
    }
}