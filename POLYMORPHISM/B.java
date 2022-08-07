package POLYMORPHISM;
// child class:
public class B extends A {
    //if we make same method in child class and modify it this is overriding

    int i=30;
    @Override
    public void test() {
        System.out.println("non static method of child class");
    }
    public static void main(String[] args) {
        B b1=new B();
        b1.test();
        B.test1();
        System.out.println(b1.i);
        A a1=new A();
        a1.test();
        A.test1();
        System.out.println(a1.i);
    }
}