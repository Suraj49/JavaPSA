package FILECLASS;

import java.io.File;

public class A {
    //flie class:- create file
    public static void main(String[] args) {
        try {
            File f = new File("E://Suraj.txt");
            f.createNewFile(); // run time exception :
            System.out.println("Done");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
