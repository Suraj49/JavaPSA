package FILEREADER_WRITER;

import java.io.FileReader;

public class B {
    public static void main(String[] args) {
        try{
            FileReader r=new FileReader("E://Suraj.txt");
            // to read all letter we have to use for loop
            for(int i=0;i<11;i++){
                System.out.print((char)r.read());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
