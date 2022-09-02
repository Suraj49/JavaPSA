package collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class B {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(5055);
        a.add(1024);
        a.add(20);
        a.add(1235);
        a.add(1548);
        Collections.sort(a);
        int idx=Collections.binarySearch(a,20);//to search any element in list we must need sorted list;
        System.out.println(a);
        System.out.println(idx);
        LinkedList l=new LinkedList();
        l.add(1547);
        l.add(5421);
        l.add(215);
        l.add(546);
        l.add(546);
        l.add(1513);
        Collections.sort(l);
        int index=Collections.binarySearch(l,2);//if element is not present then it will return -1;
        System.out.println(index);
    }
}
