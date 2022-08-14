package FILEREADER_WRITER;

import java.io.File;
import java.io.FileReader;

public class C {
    public static void main(String[] args) {
        try{
            File f= new File("E://Suraj.txt");
            FileReader r=new FileReader(f);
            // we know that using file we can count the letter so we can use in for loop
            for (int i=0;i<f.length();i++){
                System.out.print((char)r.read());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
