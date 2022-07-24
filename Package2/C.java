package Package2; //class A and C present in different-different package
import Package1.A;
/*
if you want to create object any class that is present in another package then we have to import
that class .
 */
public class C {
    public static void main(String[] args) {
        A a1=new A();
        a1.test();
        System.out.println(a1.i);
        a1.test1();
    }
}
