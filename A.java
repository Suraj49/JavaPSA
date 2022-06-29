
// Class:- class is a factory that generates objects for us.
// Object:- Object is baby of class

public class A {
    int i=10;

    public static void main(String[] args) {
        A a1=new A(); //new keyword :- It helps us to send a request to the class to create an object

        // a1 is ref variable that store the memory location of an object:

        System.out.println(a1.i); //we cannot access non static member without creating object.

        // we can access non static member through reference variable ref variable(Dot)member.

        System.out.println(a1);
    }
}