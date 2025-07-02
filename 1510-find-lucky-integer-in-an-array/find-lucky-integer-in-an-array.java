class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        int ans=-1;
        for(int key:hm.keySet()){
            if(hm.get(key)==key){
                ans=Math.max(ans,key);
            }
        }
        return ans;
    }
}