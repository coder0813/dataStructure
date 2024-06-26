package org.dataStructure._3_linkedList;

import org.dataStructure._0_exeption.CustomException;

import java.util.Arrays;
import java.util.List;


public class InterviewQuestion {

    //public static StudentNode headNode = new StudentNode(0, "0");
    static List<StudentNode> studentNodeList = Arrays.asList(
            new StudentNode(1, "1"),
            new StudentNode(2, "2"),
            new StudentNode(3, "3"),
            new StudentNode(4, "4"),
            new StudentNode(5, "5"),
            new StudentNode(6, "6")
    );

    static {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        try {
            singleLinkedList.addNodeByOrder(studentNodeList);
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 1、单链表中有效节点的个数，  不计算头节点
     */

    public static int effectiveNodeCount(StudentNode headNode) {
        int count = 0;
        if (headNode.getNext() == null) {
            return count;
        }
        StudentNode temp = headNode.getNext();
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    /**
     * 2、查找单链表中倒数第k个元素
     */


    /**
     * 3、单链表的反转
     */

    /**
     * 4、从尾巴到头打印链表
     * 1）、反向遍历
     * 2）、用栈
     */


    public static void main(String[] args) {
        System.out.printf("链表中有效节点个数:%s", effectiveNodeCount(SingleLinkedList.headNode));
    }
}
