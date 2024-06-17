package org.dataStructure._2_queue;

public class ArrayQueue {


    private final int maxSize;
    private int front;
    private int rear;
    private final int[] array;

    public ArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        array = new int[maxSize];

        //指向队列头部，分析出front是指向队列头的前一个位置
        front = -1;

        //指向队列尾，指向队列尾的数据(即就是队列最后一个数据)
        rear = -1;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueue(int number) {
        if (isFull()) {
            throw new RuntimeException("isFull");
        } else {
            rear++;
            array[rear] = number;
        }

    }

    public int getQueue() {

        if (isEmpty()) {
            throw new RuntimeException("isEmpty");
        } else {
            front++;

            int value =array[front];
            array[front]=-1;

            return value;
        }
    }

    public void showQueue() {
        if (isEmpty()) {
            for (int number : array) {
                System.out.printf("%d\t", number);
            }
            System.out.println();
            throw new RuntimeException("isEmpty");
        } else {
            for (int number : array) {
                System.out.printf("%d\t", number);
            }
            System.out.println();
        }
    }

    public int showQueueHead() {
        if (isEmpty()) {
            throw new RuntimeException("isEmpty");
        } else {
            return array[front + 1];
        }
    }
}
