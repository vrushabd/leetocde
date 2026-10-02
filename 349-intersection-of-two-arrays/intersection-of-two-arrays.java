class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0+1));
        }
        for(int i=0;i<m;i++){
            if(map.containsKey(nums2[i])){
                arr.add(nums2[i]);
                map.remove(nums2[i]);

            }
        }
        int[] result = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            result[i]= arr.get(i);
        }
        return result;
    }
}