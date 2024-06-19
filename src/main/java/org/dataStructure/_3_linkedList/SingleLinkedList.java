package org.dataStructure._3_linkedList;

import org.dataStructure._0_exeption.CustomException;

import java.util.HashMap;
import java.util.List;

public class SingleLinkedList {

    private final StudentNode headNode = new StudentNode(0, "");

    private static HashMap<Integer, String> hashMap = new HashMap<>();


    public HashMap<Integer, String> getHaspMap() {
        return hashMap;
    }


    public void showNodeLinkedList() throws CustomException {

        if (headNode.getNext() == null) {
            throw new CustomException("当前链表为空");
        }
        StudentNode tempNode = headNode.getNext();

        while (tempNode != null) {
            System.out.println(tempNode);
            tempNode = tempNode.getNext();
        }

    }


    public void addNode(StudentNode studentNode) throws CustomException {
        if (hashMap.containsKey(studentNode.getNo())) {
            throw new CustomException(String.format("当前要添加节点编号已存在：%s", studentNode));
        }
        StudentNode tempNode = headNode;
        while (tempNode.getNext() != null) {
            tempNode = tempNode.getNext();
        }
        hashMap.put(studentNode.getNo(), studentNode.getName());
        tempNode.setNext(studentNode);
    }


    public void addNodeByOrder(StudentNode studentNode) throws CustomException {
        if (hashMap.containsKey(studentNode.getNo())) {
            throw new CustomException(String.format("当前要添加节点编号已存在：%s", studentNode));
        }
        StudentNode tempNode = headNode;
        while (true) {
            if (tempNode.getNext() == null) {
                break;
            }
            if (tempNode.getNext().getNo() > studentNode.getNo()) {
                break;
            } else if (tempNode.getNext().getNo() == studentNode.getNo()) {
                throw new CustomException(String.format("当前要添加节点编号已存在：%s", studentNode));
            }
            tempNode = tempNode.getNext();
        }
        studentNode.setNext(tempNode.getNext());
        tempNode.setNext(studentNode);
        hashMap.put(studentNode.getNo(), studentNode.getName());
    }



    public void addNodeByOrder(List<StudentNode> studentNode) throws CustomException {
        for (StudentNode node : studentNode) {
            addNodeByOrder(node);
        }
    }



    public void deleteNode(StudentNode studentNode) throws CustomException {
        StudentNode tempNode = headNode;
        if (!hashMap.containsKey(studentNode.getNo())) {
            throw new CustomException(String.format("要删除的节点不存在：%s", studentNode));
        }
        if (tempNode.getNext() == null) {
            throw new CustomException(String.format("当前链表为空，无法删除节点：%s", studentNode));
        }
        while (tempNode.getNext().getNo() != studentNode.getNo()) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());
        hashMap.remove(studentNode.getNo());
    }


    public void updateNode(StudentNode studentNode) throws CustomException {
        StudentNode tempNode = headNode;
        if (!hashMap.containsKey(studentNode.getNo())) {
            throw new CustomException(String.format("要修改的节点不存在：%s", studentNode));
        }
        while (true){
            if (tempNode.getNext().getNo() == studentNode.getNo()){
                tempNode.getNext().setName(studentNode.getName());
                break;
            }
            tempNode = tempNode.getNext();
        }

        hashMap.replace(studentNode.getNo(), studentNode.getName());
    }



    }
