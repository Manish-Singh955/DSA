class Solution {
    public int maxArea(int[] height) {
       int maxWater=0;
       int lp=0;
       int rp=height.length-1;
       while(lp<rp){
            int h=Math.min(height[lp],height[rp]);
            int w=rp-lp;
            int currArea=h*w;
            maxWater=Math.max(maxWater,currArea);
           if(height[lp]<height[rp]){
            lp++;
           }else{
            rp--;
           }
       } 
       return maxWater;
    }
}