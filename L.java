//Super Keyword:-using super key we can access the members of parent class.


public class L extends K{ //child class of K so K is super class . inheritaing K using extends keyword

    int l=10;

    L(){  /*using super keyword we can call constructor of parent class but then we use super
        keyword in child class constructor and it should be the very first statement.
        */
        super(5); //constructor never gets inherited.
        System.out.println("L");

        /* if we dont keep super keyword inside compiler automatically placed super keyword.
        it can call non args constructor of super class  */

         /* if you dont create child class constructor without args the compiler automatically placed
        no args constructor along with super key
          */
    }
    L(int j){
        this();//when we use this keyword then the super keyword is not placed automatically
        //this and super is not used together
        System.out.println(j);
    }

    public static void main(String[] args) {
        L l1=new L();
        l1.test();
        new L(9);
        //super.xyz(); //Error we cant use super key inside the static member
        //super keyword can not used inside static context or method else it will gives error.
        }

    public void test() { // non static method
        System.out.println(super.i); //we Can access non static variable of parent class
        System.out.println(super.j); //we cam access static variable also but it will give warning
        super.xyz();
        super.pqr(); // using keyword we can access static and non static members both.
    }
}
