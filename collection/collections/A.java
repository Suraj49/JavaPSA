package collection.collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class A {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(5055);
        a.add(1024);
        a.add(20);
        a.add(1235);
        a.add(1548);
        Collections.sort(a);//we use collections to sort the collection if all the element have same type then sort is worked
        //sort method used bubble sort technique
        System.out.println(a);
        LinkedList l=new LinkedList();
        l.add(1547);
        l.add(5421);
        l.add(215);
        l.add(546);
        l.add(546);
        l.add(1513);
        Collections.sort(l);//we can also sort linked list
        System.out.println(l);

    }
}
