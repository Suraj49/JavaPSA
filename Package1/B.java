package Package1; //class A and B are present in same package;

public class B {
    public static void main(String[] args) {
        A a1=new A(); //class A and B both in same package so we can directly create object of A class in B class
        //hare no need to import the class A;
        a1.test();
        System.out.println(a1.i);
        System.out.println(A.j);

    }
}
