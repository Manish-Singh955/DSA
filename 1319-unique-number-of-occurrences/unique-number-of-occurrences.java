class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer>seen=new HashSet<>();
        for(int freq:map.values()){
            if(seen.contains(freq)){
                return false;
            }else{
                seen.add(freq);
            }
        }
            
        
    return true;
}
}