class MyStack {
Queue<Integer> q;
    public MyStack() {
        this.q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
        int size = q.size();
        while (size-- > 1) q.offer(q.remove());
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
