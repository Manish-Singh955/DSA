class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int maxIdx=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                smax=max;
                max=nums[i];
                maxIdx=i;
            }else if(smax<nums[i]){
                smax=nums[i];
            }
        }
        if(max>=smax*2){
            return maxIdx;
        }else{
            return -1;
        }
    }
}