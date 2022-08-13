package FILECLASS;

import java.io.File;

public class C {
    //file class : count the number of letter in a file
    public static void main(String[] args) {
        File f=new File("E://Suraj.txt");
        System.out.println("total letter is : "+f.length());
    }
}
