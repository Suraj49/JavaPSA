
/* Inheritance :- non static member of parent class are inherited to the child class object
so that we can re use the members of parent class.
 */

public class InheritanceChild extends InheritanceParent{ //using extends keyword we inherit the parent class
    public static void main(String[] args) {
        InheritanceChild c1=new InheritanceChild();
        c1.test();  // non static method called through child class object c1
        System.out.println(c1.i); //accessing non static variable through child class object c1
        //static member do not inherited but then they gives us feel of inheritance by converting the statement.
        //test1() is static method in parent class
        c1.test1();//it is converted by compiler into -> InheritanceParent.test1();
        test1();//converted by compiler into -> InheritanceParent.test1();
        InheritanceChild.test1(); //it is also converted by compiler into -> InheritanceParent.test1();
        System.out.println(c1.j); //converted by compiler into -> InheritanceParent.j;
        //Also we can create the object of parent class in this class but this id not inheritance.
    }

}
