package BUFFERED_READER_WRITER;

import java.io.BufferedReader;
import java.io.FileReader;

//buffer reader reads the data line by line present in file
public class A {
    public static void main(String[] args) {
        try {
            FileReader f=new FileReader("E://test.txt");
            //we can use file reader for Buffer reader
            //we can not use file for buffer reader
            BufferedReader reader=new BufferedReader(f);
            System.out.println(reader.readLine());//we dont have read line in file reader


        }catch (Exception e){
            System.out.println(e);
        }
    }
}
