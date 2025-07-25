class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int second=target-nums[i];
            if(map.containsKey(second)){
                return new int []{map.get(second),i};
            }else{
                map.put(nums[i],i);
            }

        }
        return new int []{};
    }
}