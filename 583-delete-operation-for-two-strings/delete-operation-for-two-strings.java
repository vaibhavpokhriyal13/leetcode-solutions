class Solution {
      public int lcs(String a,String b,int m,int n,int[][] dp){
        if(m==0 || n==0){
            return 0;
        }

        if(dp[m][n]!=-1){
            return dp[m][n];
        }

        if(a.charAt(m-1) == b.charAt(n-1)){
            return dp[m][n]=1+lcs(a,b,m-1,n-1,dp);
        }
        else{
            return dp[m][n]=Math.max(lcs(a,b,m,n-1,dp),lcs(a,b,m-1,n,dp));
        }
    }
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return (m-lcs(word1,word2,m,n,dp))+(n-lcs(word1,word2,m,n,dp));
    }
    
}