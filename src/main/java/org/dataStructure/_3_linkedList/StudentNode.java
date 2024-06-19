package org.dataStructure._3_linkedList;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentNode {


    private int no;

    private String name;

    private StudentNode next;

    public StudentNode(int no, String name) {
        this.no = no;
        this.name = name;
    }


    @Override
    public String toString() {
        return "StudentNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
