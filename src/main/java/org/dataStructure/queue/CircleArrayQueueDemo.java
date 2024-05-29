package org.dataStructure.queue;

import java.util.Scanner;

public class CircleArrayQueueDemo {

    public static void main(String[] args) {

        CircleQueueDemo();
    }

    public static void CircleQueueDemo() {


            CircleArrayQueue circleArrayQueue = new CircleArrayQueue(5);
            char input;
            System.out.println("队列测试");

            Scanner scanner = new Scanner(System.in);
            boolean flag = true;
            while (flag) {
                System.out.println("--------------------------");
                System.out.println("s(show):显示队列");
                System.out.println("e(exit):退出程序");
                System.out.println("a(add):添加数据到队列");
                System.out.println("g(get):从队列取出数据");
                System.out.println("h(head):查看队列头的数据");
                System.out.println("--------------------------");
                input = scanner.next().charAt(0);

                try {
                switch (input) {
                    case 's':
                        circleArrayQueue.showQueue();
                        break;
                    case 'e':
                        scanner.close();
                        flag = false;
                        break;
                    case 'a':
                        System.out.println("请输入进入队列的数字：");
                        int value = scanner.nextInt();
                        circleArrayQueue.addQueue(value);

                        circleArrayQueue.showQueue();
                        break;
                    case 'g':
                        int queue = circleArrayQueue.getQueue();
                        System.out.println("取出的数据是：" + queue);
                        circleArrayQueue.showQueue();

                        break;
                    case 'h':
                        circleArrayQueue.showQueueHead();
                        break;
                    default:
                        break;
                }
                }catch (RuntimeException e){
                    System.out.println("发生异常-------"+e);
                }
            }
            System.out.println("退出");



    }


















}
