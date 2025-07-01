class Solution {
    public int tribonacci(int n) {
        if(n==0)return 0;
        else if(n==1||n==2)return 1;
        else {
            int fv=0;
            int se=1;
            int th=1;
            for(int i=1;i<=n;i++){
                int fu=fv+se+th;
                fv=se;
                se=th;
                th=fu;
            }
            return fv;
        }
        
    }
}