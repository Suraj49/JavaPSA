package FINALKEYWORD;
//final variable: if you make a variable final then you can not re-assign that variable

public class A {
   // final static int k; we know that static and nonstatic variables gets default value
    //but if make final variable then its initialization becomes mandatory
    final static int l=30;//
    final int n=50;
    public static void main(String[] args) {
       final int i=20;
       // i=40; re assigning is not allowed
        System.out.println(i);
        A a=new A();
        System.out.println(a.n);
        System.out.println(A.l);
    }
}
