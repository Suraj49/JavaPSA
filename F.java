//Method : method will execute when we call it

public class F {
    public static void main(String[] args) {
        System.out.println("hello from main");
        F f1=new F();
        f1.test1(); //calling method test1;
        f1.test2(); //calling static method using ref variable
        //also
        F.test2();//we can call static method using Class name;

        int t=f1.test3(); //storing the value in int t that is returned by test3();
        System.out.println(t);

        f1.test4(354); //caling method and [passing 100] into method argument

        return; //return control to the JVM main return the control to JVM.
    }
    public void test1(){ //non static method
        System.out.println("Hello From test1 non static");
        //method will return the control back to the place from where it will called
    }
    public static void test2(){
        System.out.println("Hello from test2 Static method");
        return; // return the control back to the place from where it will called
        //when ever you write return keyword it should be at the very last statment in that method
        //if you write any thing after return keyword it will gives error : unreachable code
        //System.out.println("hi");
    }
    public int test3(){
        //when ever method is returning value the return type of method can never be void
        System.out.println("hello fome test3 return the value");
        return 100;// return 100 from where it will called
    }
    public void test4(int i){
        //int i is argument and i is local variable for this method
        System.out.println("hello form test4 passed value is "+i);
        return;
    }
}
