class Solution {
    public int reverseDegree(String s) {
        int prod = 0;
        for(int i = 0;i<s.length();i++){
            int a = 123 - s.charAt(i);
             prod = prod + ((i+1) * a);
        }
        return prod;
    }
}