package FILEREADER_WRITER;

import java.io.File;
import java.io.FileWriter;

public class D {
    public static void main(String[] args) {
        try {
            File f = new File("E://Suraj.txt");
            FileWriter w = new FileWriter(f);
            w.write("Suraj Kumar");//write("we can write anything inside double");
            w.close();//we dont write this it will not go inside the file

            System.out.println("Done ! file lenght is: "+f.length());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
