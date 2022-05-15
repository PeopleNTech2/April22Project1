package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(52);
        list.add(74);
        list.add(86);
        list.add(96);
        list.add(34);

        System.out.println(list);

        list.add(1, 0);

        System.out.println(list);

        list.set(0, 1);

        System.out.println(list);

        list.add(1, 98746);

        System.out.println(list);

        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        List<Object> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(1.235);
        list1.add('$');
        list1.add(false);
        list1.add("word");

        System.out.println(list1);

        Iterator it = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}
