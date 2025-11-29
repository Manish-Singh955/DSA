class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        HashSet<Character>set=new HashSet<>();
        int maxlen=0;
        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                maxlen=Math.max(maxlen,set.size());
                r++;
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxlen;
    }
}