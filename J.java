// This Keyword :- This keyword points to the current object executing.


public class J {
    int i=10;
    static int j=20;
    int t;
    J(){
        System.out.println("It is called using This keyword");
    }
    J(int t){
        //we can call constructor through this key . to call constructor write this() and it should be very first statement of another constructor
        this();
        this.t=t;//this.t means non static variable because this cannot access local variable
        //copying the value of t into non static variable
        System.out.println(this.t);

    }

    public static void main(String[] args) {
        J j1=new J();
        System.out.println(j1.i); //accessing non static member through reference variable
        System.out.println(j1); //printing address of object.
        j1.test1();
        j1.test3();
    }
    public void test1(){
        //only if the method is non static then this keyword is works..
        System.out.println(this.i); // accessing non static member through this key .
        System.out.println(this.j); //we can access both static and non static member through This keyword
        //this keyword is also like ref. variable and it is created by JVM.
        //J1 an This is pointing the same object.
        System.out.println(this); //peinting address of object. both are same
        this.test2(); //we can call both static and non static method also.
        int k=33;
        //System.out.println(this.k); we cant access local variable thorough this keyword.
    }
    public static void test2(){
       // System.out.println(this.i); //we can't use this keyword inside static method it will give error;
        System.out.println("static method test2");
    }
    public void test3(){
        System.out.println("test3.");
        int i=50; //we can create loacl variable with same name
        System.out.println(this.i);//we cant access local variable through this keyword so it non static variable i;
    }
}
