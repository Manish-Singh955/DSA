class Solution {
    public int maxProduct(int[] nums) {
        int firstMax=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstMax){
                secMax=firstMax;
                firstMax=nums[i];
            }else if(nums[i]>secMax){
                secMax=nums[i];
            }
      
    }
    return (firstMax-1)*(secMax-1);
    }
}