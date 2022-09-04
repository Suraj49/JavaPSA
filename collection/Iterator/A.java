package collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class A {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        a.add(40);
        a.add(50);
        a.add(65);
        Iterator<Integer> itr = a.iterator();
        while (itr.hasNext()){ //check if the data is present into next step then we use
            //hasNext check the data into next step. if data is present then it will return true
            System.out.println(itr.next());//next method prints the value that is present in the
        }

    }
}
