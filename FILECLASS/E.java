package FILECLASS;

import java.io.File;

public class E {
    //FILE CLASS : we can delete file and folder also
    public static void main(String[] args) {
        try{
            File f=new File("E://Suraj");
            f.delete();
            System.out.println("Done!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
