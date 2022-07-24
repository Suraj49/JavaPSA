/* Inheritance :- non static member of parent class are inherited to the child class object
so that we can re use the members of parent class.
 */
public class InheritanceParent {
    int i=10;
    //non static member of parent class are inherited to the child class
    public void test(){
        System.out.println("Non static method of parent class");
    }

    static int j=55;
    //static members do not inherited
    public static void test1(){
        System.out.println("Static method of parent class");
    }
}
