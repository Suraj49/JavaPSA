package collection.collections;

import java.util.ArrayList;
import java.util.Collections;

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
    }
}
