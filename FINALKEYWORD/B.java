package FINALKEYWORD;

public class B {
    public static void main(String[] args) {
        B b=new B();
        b.test(120);
    }
    public void test(final int i){
        // i=30; error
        System.out.println(i );
    }
}
