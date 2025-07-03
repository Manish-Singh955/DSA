class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
       int numcount=0;
       int targetcount=0;
       for(int ele:nums){
        if(ele==target){
            targetcount++;
        }else if(ele<target){
            numcount++;
        }
       } 
       List <Integer> ans=new ArrayList<>();
       while(targetcount>0){
        ans.add(numcount);
        numcount++;
        targetcount--;
       }
       return ans;
    }
}