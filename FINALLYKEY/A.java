package FINALLYKEY;

public class A {
    public static void main(String[] args) {
        try{
            int i=10/0; //Exception hare in try block exception is created
            System.out.println(i);//if exception preset in try block the try block never execute
            System.out.println("try");
        }catch (Exception e){ //catch block handles with exception so it is execute
            System.out.println(e);
            System.out.println("catch");
        }finally { //no matter if Exception is present or not finally block will always execute
            System.out.println("finally");
        }
    }
}
