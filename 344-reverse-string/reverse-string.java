class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char rev[]=new char[n];
        int start=0;
        for(int i=n-1;i>=0;i--){
            rev[start]=s[i];
            start++;
        }
        for (int i = 0; i < n; i++) {
    s[i] = rev[i];
}
        
    }
}