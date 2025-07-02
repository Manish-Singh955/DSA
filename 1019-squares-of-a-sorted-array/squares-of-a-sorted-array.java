class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int val=nums[i]*nums[i];
            ans.add(val);
        }
        Collections.sort(ans);
        int res[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}