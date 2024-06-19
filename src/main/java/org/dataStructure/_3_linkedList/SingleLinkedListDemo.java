package org.dataStructure._3_linkedList;

import org.dataStructure._0_exeption.CustomException;
import java.util.Arrays;
import java.util.List;

public class SingleLinkedListDemo {


    public static void main(String[] args) throws CustomException {



        SingleLinkedList singleLinkedList = new  SingleLinkedList();
        List<StudentNode> studentNodeList = Arrays.asList(
                new StudentNode(11, "1"),
                new StudentNode(22, "2"),
                new StudentNode(3, "3"),
                new StudentNode(4, "4"),
                new StudentNode(5, "5")
        );
        singleLinkedList.addNodeByOrder(studentNodeList);
        singleLinkedList.showNodeLinkedList();

        System.out.println(singleLinkedList.getHaspMap());
        System.out.println("----------------------------------------");
        singleLinkedList.deleteNode(new StudentNode(5, "5"));
        singleLinkedList.showNodeLinkedList();
        System.out.println(singleLinkedList.getHaspMap());

        System.out.println("----------------------------------------");
        singleLinkedList.updateNode(new StudentNode(3, "33"));
        singleLinkedList.updateNode(new StudentNode(6, "33"));
        singleLinkedList.showNodeLinkedList();
        System.out.println(singleLinkedList.getHaspMap());

    }
}
