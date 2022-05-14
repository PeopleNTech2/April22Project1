package datastructure;

import java.util.LinkedList;

public class UseLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(52);
        list.add(74);
        list.add(86);
        list.add(96);
        list.add(34);

        System.out.println(list);

        list.remove();

        System.out.println(list);

    }
}
