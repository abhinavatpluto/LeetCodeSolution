package org.leetCode.starDust;

public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

//    public void push(int value){
//        if(isFull()){
//            System.out.println("This stack is full");
//        }else{
//            top++;
//            stackArray[top] = value;
//        }
//    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return stackArray[top--];
    }

    public void push(int x) {
        top++;
        stackArray[top] = x;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

    }


}
