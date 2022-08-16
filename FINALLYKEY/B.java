package FINALLYKEY;

public class B {
    public static void main(String[] args) {
        try{
            System.out.println("try block");
        }finally { //we can use finally after try block
            System.out.println("finally block");
        }
    }
}
