// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> s=new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {
        
        
    }
    
    public void push(int x) {
        if(x<=min){
            s.push(min);
            min=x;
        }
        s.push(x);
        
    }
    
    public void pop() {
        int n = s.pop();
        if(n==min){
            min=s.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */