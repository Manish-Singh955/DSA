class Solution {
    public int singleNonDuplicate(int[] nums) {
        int st=0,end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
           if ((mid == 0 || nums[mid] != nums[mid - 1]) && 
    (mid == nums.length - 1 || nums[mid] != nums[mid + 1]))
    return nums[mid];
            if(mid%2==0){
                if(nums[mid-1]==nums[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }else{
                if(nums[mid-1]==nums[mid]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}