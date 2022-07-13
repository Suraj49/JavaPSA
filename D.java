// Type casting : 1. Auto (Up casting), 2. Explicit type casting
// converting one data type to require data type is called type casting.
// 1. Auto (up casting): small memory to big memory(small data type to big data type)
// 2. Explicit type casting: big memory to small memory
public class D {
    public static void main(String[] args) {
        int i=10; // int 4 byte
        long j=i; //long 8 byte : small into big auto upcasting:
        System.out.println(j);
       // byte t=i; // byte size 1byte here big to small is not performed directly
        byte t= (byte) i; // (require data type) here explicit type casting is performed
        System.out.println(t);
        //also
        long l=123;
        byte b= (byte)(int) l; //it means long converted into int and int converted into byte
        System.out.println(b);
    }
}
