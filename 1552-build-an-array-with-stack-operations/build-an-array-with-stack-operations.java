class Solution {
    public List<String> buildArray(int[] target, int n) {
     List<String> lst=new ArrayList<>();
     int j=0;
     for(int i=1;i<=n && j<target.length ;i++){
        lst.add("Push");
        if(i==target[j]){
            j++;
        }
        else{
            lst.add("Pop");
        }

     }
     return lst;
        
    }
  
}