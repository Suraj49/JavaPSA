//IIB : Instance Initialization block

//IIB are execute when objects are created .
//No of time we create the onject the same no of time IIB is called
//IIB are used to initialized all the instance variable in one place and it gives ous batter readability of the code.
// we can initialize both static and non static variable inside IIB block;

public class H {

    H(){ //Constructor Block
        System.out.println("Constructor ");
        //if in program have both constructor and IIB then all IIB execute 1st then Constructor
        //Becouse first initialized all the variable then it will used.
    }

    { // 1. IIB block {.....}
        System.out.println("1. IIB Block ");
        //we can write anything in IIB block
    }
    int i;
    int j;
    {// 2. IIB block...
        System.out.println("2. IIB Block ");
        i=23;
        j=25;
        System.out.println(i);
        System.out.println(j);

    }

    public static void main(String[] args) {
        H h=new H(); // IIB run automatically when object is created.
        // if object is not created then IIB block is not called.[same as constructor]
        H h2=new H();
        // the no of time object is created that no of time IIB block is called
    }
}
