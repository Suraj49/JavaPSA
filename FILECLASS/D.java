package FILECLASS;

import java.io.File;

public class D {
    //file class :  make folder
    public static void main(String[] args) {
        try{
            File f=new File("E://Suraj");
            f.mkdir(); //creating folder name of folder Suraj
            System.out.println("done !");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
