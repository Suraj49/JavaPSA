// Variables in java:
// 1. Static variable
// 2. Non Static variable
// 3. Local variable
// 4. ref. variable


public class B {
    //1. Static variable
    static int x=10; //declered outside all the method but inside the class
    // use anywhere in the class.
    static int y;// not mandatory to initialized. automatically get some value by compiler

    // 2. Non Static variable
    int i=20; //declered outside all the method but inside the class without use static key
    // use anywhere in the class.
    int j; // not mandatory to initialized. automatically get some value by compiler

    public static void main(String[] args) {
        System.out.println(B.x); //We can access static variable through class name
        System.out.println(y);//also we can access directly ; by compiler it is converted into (B.x)
        B b1=new B();
        System.out.println(b1.x); //also we can access through ref variable, is will gives warning
        System.out.println(b1.i); // reference variable is mandatory to access non static variable
        System.out.println(b1.j);

        b1.test();
        //System.out.println(d); //we cant access local variable outside the method

    }
    public void test(){
        //3. local variable
        int d=12; // created within inside the any method and also used inside the same method
        System.out.println(d); //we can access local variable directly
        int e;
       // System.out.println(e); // we can't use local variable without initialized it will give error
    }
}
