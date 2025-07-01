class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>ans=new ArrayList<>();
        int p=num.length-1;
        int car=0;
        while(p>=0||k>0){
            int numVal=0;
            if(p>=0){
                numVal=num[p];
            }
            int d=k%10;
            int sum=numVal+d+car;
            int digit=sum%10;
            car=sum/10;
            ans.add(digit);
            p--;
            k=k/10;
        }
        if(car>0){
            ans.add(car);
        }
        Collections.reverse(ans);
        return ans;
    }
}