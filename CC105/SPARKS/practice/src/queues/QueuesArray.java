package queues;

class QueuesArray {
    private int[] arr;
    private int front, rear, size, capacity;

    public QueuesArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full!");
            return;
        }
        rear++;
        arr[rear] = item;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int item = arr[front];
        front++;
        size--;
        return item;
    }

    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
