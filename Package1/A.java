/*
package :- it is nothing but giving me a folder to store a program to organized manner .
 */

package Package1; //if we create package this line is mandatory -> package Package1;

public class A {

    //non static context
    public int i=10;
    public void test(){
        System.out.println("non static method of package1");
    }
    //static context
    public static int j=30;
    public static void test1(){
        System.out.println("static method of package1");
    }

}
