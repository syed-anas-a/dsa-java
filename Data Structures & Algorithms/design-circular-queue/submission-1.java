class MyCircularQueue {
    int[] arr;
    int front;
    int count;
    int size;

    public MyCircularQueue(int k) {
        this.arr = new int[k];
        this.size = k;
        this.front = 0;
        this.count = 0;
    }
    
    public boolean enQueue(int value) {
        if(count == size) return false;
        arr[(front+count)%size] = value;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(count == 0) return false;
        arr[front] = 0;
        front = (front+1) % size;
        count--;
        return true;
    }
    
    public int Front() {
        if(count == 0) return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(count == 0) return -1;
        return arr[(front+count-1)%size];
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */