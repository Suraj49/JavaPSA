package POLYMORPHISM;
//polymorphism : developing a feature such that it can take more then one form is called as polymorphism
//two way :- 1. overloading, 2.overriding
//1. Overriding : only if inheritance is happening overriding is possible.
public class A {
    int i=10;
    //overriding for a variable is not possible
    public void test(){
        System.out.println("non static method parent class");
        // if you want to modify the inherited method of parent class in child class then
        // we use the concept of overriding
    }
    //only non static member can override because only non static member get inherited.
    public static void test1(){
        System.out.println("static member of Parent class");
    }
}
