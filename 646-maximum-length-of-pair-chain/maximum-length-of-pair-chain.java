class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int maxLen=1;
        int endVal=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>endVal){
                maxLen++;
                endVal=pairs[i][1];
            }
        }
        return maxLen;
    }
}