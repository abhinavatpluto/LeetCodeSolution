package org.leetCode.starDust;

public class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
    }

    public void insert(int value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = value;
    }

    public int remove() {
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        return temp;
    }

    public int peek() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (rear + 1 == front || front + maxSize - 1 == rear);
    }

    public boolean isFull() {
        return (rear + 2 == front || front + maxSize - 2 == rear);
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.insert(1);
        queue.insert(2);
    }
}
