class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> m = new HashMap<>();
      
        int n = candyType.length;
        int limitcandy = n/2;
        for(int i=0;i<n;i++){
           m.put(candyType[i],m.getOrDefault(candyType[i],0)+1);
        }

       if(m.size()<=limitcandy){
        return m.size();
       }
       return limitcandy;
     

    }
}