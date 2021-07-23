// leetcode program // date: 22 july 2021
class MyQueue {
    Stack <Integer> sta;

    /** Initialize your data structure here. */
    public MyQueue() {
        sta = new Stack <Integer> ();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
         sta.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
         int p =sta.get(0);
        sta.removeElementAt(0);
        return p;

        
    }
    
    /** Get the front element. */
    public int peek() {
         return sta.get(0);
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(sta.empty())
            return true;
        else
            return false;
        
    }
}
----------------------------------------------
Accepted
Runtime: 0 ms
Your input
["MyQueue","push","push","peek","pop","empty"]
[[],[1],[2],[],[],[]]
Output
[null,null,null,1,1,false]
Expected
[null,null,null,1,1,false]
