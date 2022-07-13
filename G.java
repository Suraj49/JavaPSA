//constructor : constructor should have same name as that class.

//Method vs Constructor
//1. A method can be void and it have return type but constructor is always by default void;
//2. Method can execute when we call it but constructor is executed upon object creation

public class G {
    public void G(){
        // We can create method same as class name
        System.out.println("This is not constuctor becouse in constructor we can not write any return type");
    }
    G(){
        //we cannot call same constructor inside consturctor
        //new G();
        System.out.println("Hello Constructor");
        return;
    }
    //if you are using more then one constructor in same class you need to differentiate with argument
    G(int i){ // constructor that takes argument
        System.out.println(i);
        System.out.println("constructor with argument");
        //also we can call another constructor
        new G();

        return;
        // we can write return keyword but we cannot return any value because by default constructor have void return type
        //but we can't write void
    }
    public static void main(String[] args) {
        G g1=new G(); //constructor will execute when object is created
        //the no of time object is created these many times constructor is called
        new G();
        G g2=new G(121); // calling constructor that takes argument
        g1.G(); //Calling method G();
    }
}
