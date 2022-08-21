package FINALKEYWORD;

//Array Final : if you make array final then you cannot re-change the size of array

public class C {
    public static void main(String[] args) {
        final int[] A=new int[5];
        A[0]=5;
        A[1]=7;
        A[0]=6;//this is possible
       // A =new int[4]; this is not possible because there we are changing the size of array
        System.out.println(A[0]);
        System.out.println(A[1]);

    }
}
