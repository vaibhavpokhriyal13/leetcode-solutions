class Solution {

    public int lcs(int[] a,int[] b,int m,int n,int[][] dp){
        if(m==0 || n==0){
            return 0;
        }

        if(dp[m][n]!=-1){
            return dp[m][n];
        }

        if(a[m-1] == b[n-1]){
            return dp[m][n]=1+lcs(a,b,m-1,n-1,dp);
        }
        else{
            return dp[m][n]=Math.max(lcs(a,b,m,n-1,dp),lcs(a,b,m-1,n,dp));
        }
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return lcs(nums1,nums2,m,n,dp);
        
    }
}