class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
        m.put(magazine.charAt(i),m.getOrDefault(magazine.charAt(i),0)+1);

}
for(int i=0;i<ransomNote.length();i++){
            if(m.get(ransomNote.charAt(i)) == null || m.get(ransomNote.charAt(i)) == 0){
                return false;
            }
            m.put(ransomNote.charAt(i),m.get(ransomNote.charAt(i))-1);
}
return true;


    }
}