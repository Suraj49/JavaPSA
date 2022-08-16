package FINALLYKEY;

public class C {
    public static void main(String[] args) {
        try{
            System.out.println("try block");
        }finally {
            System.out.println("finally");
        }// we can not use catch () after finally block
    }
}
