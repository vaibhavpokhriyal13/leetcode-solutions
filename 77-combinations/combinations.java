class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> arr=new ArrayList<>();
        comb(n,k,arr,new ArrayList<>(),1);
        return arr;
    }

    public void comb(int n,int k,List<List<Integer>> arr,List<Integer> curr,int i){
        if (i > n) {
            if (curr.size() == k) {
                arr.add(new ArrayList<>(curr));
            }
            return;  
            }

        
         curr.add(i);
        comb(n,k,arr,curr,i+1);
        curr.remove(curr.size()-1);
        comb(n,k,arr,curr,i+1);


    }
}