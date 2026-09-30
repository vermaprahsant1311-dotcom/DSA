class MyQueue {

    public Stack<Integer> Instack  ;
    public Stack<Integer> Outstack ;

    public MyQueue() {
        Instack = new Stack<>();
        Outstack = new Stack<>();
    }
    
    public void push(int x) {
        Instack.push(x);
    }
    
    public int pop() {
        Queue();
        return Outstack.pop();
    }
    
    public int peek() {
        Queue();
        return Outstack.peek();
    }
    
    public boolean empty() {
        return Instack.empty() && Outstack.empty();
    }
    private void Queue() {
        if (Outstack.isEmpty()) {
            while (!Instack.isEmpty()) {
                Outstack.push(Instack.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */