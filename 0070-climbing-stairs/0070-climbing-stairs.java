class Solution {
    public int helper(int n,int[] dp){

        if(n<=2){
            return n ;
        }
        if(dp[n]!=-1) return dp[n];
        return dp[n]=helper(n-1,dp)+ helper(n-2,dp);
    }
    public int tab(int n){
        // int[] dp = new int[n+1];
        int ans = 0 ;
        if(n<=2){
            return n;
        }
        // Arrays.fill(dp,-1);
        // dp[0]=0;
        // dp[1]=1;
        // dp[2]=2;
        int y = 1;
        int z = 2;
        for(int i=3; i<=n; i++){
            // dp[i]=dp[i-1]+dp[i-2];
            ans = y+z;
            y=z;
            z= ans;
            

        }
        // return dp[n];
        return ans;
        
    }
    public int climbStairs(int n) {
        
        // return helper(n,dp);
        return tab(n);
    }
}