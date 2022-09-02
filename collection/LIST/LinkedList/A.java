package collection.LIST.LinkedList;

import java.util.LinkedList;

public class A {
    public static void main(String[] args) {
        LinkedList a=new LinkedList();//it gives us doubly linked list ,it is class
        a.add(10); //indax:0  add method adds the element
        a.add("suraj");//index:1  array list can store any type of data
        a.add(10.4);//index:2
        a.add("suraj kumar");//index:3
        a.add(10);//index:4  it can contain duplicate element like contact no
        System.out.println(a);//printing arrayList
        System.out.println(a.size());//size method returns the number of element
        System.out.println(a.get(0));//get(index) method gives the element of specific index
        System.out.println(a.contains(10)); // contains method check the element if element is present then it will return true
        System.out.println(a.contains(13));//false because in list 13 is not present
        a.remove(4);//remove the element form index no 4
        System.out.println(a);
        a.removeAll(a);//removeAll element but not memory address
        //a.clear();//it will also remove all element with memory address
        System.out.println(a);

    }
}
