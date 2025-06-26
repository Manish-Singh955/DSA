class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>result=new ArrayList<>();
        int minVal=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            minVal=Math.min(minVal,arr[i]-arr[i-1]);
            }
          for(int i=1;i<arr.length;i++){
            if(minVal==arr[i]-arr[i-1]){
            List<Integer>pair=new ArrayList<>();
            pair.add(arr[i-1]);
            pair.add(arr[i]);
            result.add(pair);
            }
          }
        
        return result;
    }
}