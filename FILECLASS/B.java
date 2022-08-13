package FILECLASS;

import java.io.File;

public class B {
    //file class can check file is present or not
    public static void main(String[] args) {
        try {
            File f = new File("E://Suraj.txt");
            System.out.println(f.exists());//if file is present then it will show true other wise false
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
