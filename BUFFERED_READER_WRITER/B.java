package BUFFERED_READER_WRITER;

import java.io.BufferedWriter;
import java.io.FileWriter;

//Buffer writer it helps us to write the containt into file
public class B {
    public static void main(String[] args) {
        try{
            FileWriter f=new FileWriter("E://test.txt");
            BufferedWriter writer=new BufferedWriter(f);
            writer.write("Suraj");
            writer.newLine(); //this is use to make new line into file
            //this method is not present in File writer
            writer.write("Kumar");
            writer.newLine();
            writer.write("Hello");
            writer.close();//when we dont write this, then containt will not get in side the file
            System.out.println("Done..!");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
