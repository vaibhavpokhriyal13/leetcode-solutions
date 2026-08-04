class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int[] num=new int[n];



        for(int i=0;i<n;i++){
            int max=0;
            for(int j=i+1;j<n;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
                num[i]=max;
            }
            

        }
        num[n-1]=-1;
        return num;
        
    }
}