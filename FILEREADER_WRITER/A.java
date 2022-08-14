package FILEREADER_WRITER;

import java.io.FileReader;

// FileReader Class:- it helps ous to read file contain from file
public class A {
    public static void main(String[] args) {
        try{
            FileReader r=new FileReader("E://Suraj.txt");
           // System.out.println(r.read());// it return the number
            //so we have to convert into char
            System.out.println((char)r.read());//but it will show only one letter
            for(int i=0;i<10;i++){
                System.out.print((char)r.read());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
