class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] s1=word1.toCharArray();
        char[] s2=word2.toCharArray();
        int n= s1.length +s2.length;
        char[] arr=new char[n];


       int i = 0; // word1
int j = 0; // word2
int k = 0; // merged array

while (i < s1.length && j < s2.length) {
    arr[k++] = s1[i++];
    arr[k++] = s2[j++];
}

while (i < s1.length) {
    arr[k++] = s1[i++];
}

while (j < s2.length) {
    arr[k++] = s2[j++];
}

return new String(arr);

        
    }
}