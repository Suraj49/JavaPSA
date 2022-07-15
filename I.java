
//SIB : Static Initialization Block
//SIB block run before all the method (before main) and it does not require invoking statement
//need not to create object

public class I {
    I(){ //Constructor
        System.out.println("Constructor");
        // for constructor need to create object.
    }
    {//1.IIB Block
        System.out.println("IIB Block");
        //always 1.execute SIB{...}, 2. Main(), 3. IIB{...} and 4. Constructor I().
    }
    {//2. IIB Block
        System.out.println("2. IIB Block");
       // I i3=new I();
        //yes ! we can also create object in side the IIB block but when object is created then iib block execute
        //then is become infinte loop.
    }
    static { //1. SIB Block..
        System.out.println("1. SIB Block");
        //Static block run directly no need to create object.
    }
    static int i;
    static { //2.SIB Block
        //Static Initialization block Initialize only static member
        System.out.println("2. SIB Block");
        i=30; //Non static variable can not Initialize into static block because non static belongs to object
        System.out.println(i);
    }
    static { // 3. SIB Block
        System.out.println("3. SIB Block");
        //we can create an object into static block
        I i2= new I();
    }

    public static void main(String[] args) {
        I i1=new I();
    }
}
