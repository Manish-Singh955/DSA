class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
       
          HashMap<Character,Character> map=new HashMap<>();
          HashSet<Character> used=new HashSet<>();
          for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map.containsKey(ch1)){
                if(map.get(ch1)!=ch2)return false;
            }else{
                if(used.contains(ch2))return false;
                map.put(ch1,ch2);
                used.add(ch2);
            }
            
          }
          return true;
    }
}