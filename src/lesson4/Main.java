package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();

        mll.insertFirst(5);
        mll.insertFirst(15);
        mll.insertFirst(25);
        mll.insertFirst(35);


        System.out.println(mll);
//           Проверка метода indexOf()
        System.out.println (mll.indexOf (5));
        System.out.println (mll.indexOf (15));
        System.out.println (mll.indexOf (35));
        System.out.println (mll.indexOf (25));
        System.out.println (mll.indexOf (100));

        //   Связанная очередь
        LinkedQueue linkedQueue = new LinkedQueue ();

        linkedQueue.insert (1);
        linkedQueue.insert (2);
        linkedQueue.insert (3);
        linkedQueue.insert (4);


        System.out.println (linkedQueue);
        System.out.println (linkedQueue.remove ());
        System.out.println (linkedQueue);
        System.out.println ( linkedQueue.peekFirst ());
    }

}
