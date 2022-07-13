// Unary operator : 1. Increment , 2. Decrement
//1. Increment : 1. post Increment (var++), 2. Pre Increment(++var)
//2. Decrement : 1. post Decrement (var--), 2. Pre Decrement(--var)

public class E {
    public static void main(String[] args) {
        //decrement
        //post decrement
        int l = 16;
        int m = l--; //post decrement l-- when we see next l then decresed the value by one
        System.out.println(l); // value decresed by 1: 16-1=15
        System.out.println(m); // but value of m=l-- it means m=16-- so j=16;
        //pre decrement
        int o=24;
        int p=--o; // pre decrement --o decrement the value 1 at same level
        System.out.println(o); // here p=--o ; p=--24 decrement at same level so p=23;
        System.out.println(p); // and also --o it means --24 is o=23;


        //increment
        //post increment
        int i = 12;
        int j = i++; //post increment i++ when we see next i then increse the value by one
        System.out.println(i); // value incresed by 1: 12+1=13
        System.out.println(j); // but value of j =i++ it means j=12++ so j=12;
        //pre increment
        int x=24;
        int y=++x; // pre increment ++i increse the value 1 at same level
        System.out.println(y); // here y=++x ; y=++24 increment at same level so y=25;
        System.out.println(x); // and also ++x it means ++24 is x=25;


    }

}
