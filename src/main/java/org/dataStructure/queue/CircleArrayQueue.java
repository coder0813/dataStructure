package org.dataStructure.queue;

public class CircleArrayQueue {


    private final int  maxSize;
    private  int front;//指向队列的第一个元素  ，初始值为0
    private int rear; //指向队列最后一个元素的   后一个 元素  希望空出一个空间作为约定   初始值0
    private final int[] array;

    public CircleArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        array = new int[maxSize];
    }


    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueue(int number) {
        if (isFull()) {
            throw new RuntimeException("isFull");
        } else {
            array[rear] = number;
            rear = (rear + 1) % maxSize;
        }

    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("isEmpty");
        } else {
            int value = array[front];
            front = (front + 1) % maxSize;
            return value;
        }
    }

    public void showQueue() {
        if (isEmpty()) {
            throw new RuntimeException("isEmpty");
        } else {
            for (int i = front; i < front + size(); i++) {
                System.out.printf("arr[%d]=%d\n", i % maxSize, array[i % maxSize]);
            }
            System.out.println();
        }
    }

    public int showQueueHead() {
        if (isEmpty()) {
            throw new RuntimeException("isEmpty");
        } else {
            return array[front];
        }
    }

    public int size() {
        return (rear + maxSize - front) % maxSize;
    }

}
