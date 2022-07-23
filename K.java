//Super Keyword:-using super key we can access the members of parent class.
//inheritance is req.

public class K { //parent class of L class [go to class L]
    public int i=10; //public non-static variable
    public static int j=20;

    public K(int i) {
        System.out.println("called by super "+i);
    }

    public void xyz(){
        System.out.println("Non static method");
    }
    public static void pqr(){
        System.out.println("Static method");
    }
    K(){
        System.out.println("costructor K ");
    }
}
