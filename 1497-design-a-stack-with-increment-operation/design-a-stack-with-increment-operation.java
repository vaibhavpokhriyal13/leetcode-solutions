class CustomStack {
    Stack<Integer> s1; 
    Stack<Integer> s2;
    int maxSize;

    /**
    s1 
    s2
    loop for i = size-k{
    s2.push(s1.pop())}
    s2.push(s1.pop()+incrementvalue)
    then while(s2.isnot empty){
    push in s1}   
     */

    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
        s1=new Stack<>();
        s2=new Stack<>();
        
    }
    
    public void push(int x) {
        if(s1.size()<maxSize){
            s1.push(x);
        }
        return;
        
    }
    
    public int pop() {
         if (s1.isEmpty()) {
            return -1;
        }
        return s1.pop();
        
    }
    
    public void increment(int k, int val) {
        int size = s1.size();
        if (size==0) return;
      if (k > size) k = size;
        for(int i=0;i<size-k;i++){
            s2.push(s1.pop());
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop()+val);
        }
        
        
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
        
    
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */