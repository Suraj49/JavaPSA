package FINALLYKEY;

import java.io.FileReader;
import java.io.IOException;

public class D {
    //finally block is use to close something link dataBase connection close, file close
      static FileReader f;
    public static void main(String[] args) {
        try {
            f=new FileReader("E://Suraj.txt");
            System.out.println((char)f.read());
        } catch (Exception e){
            System.out.println(e);
        }finally {
            try {
                if(f!=null){
                    f.close();//f.close is also compile time exception so we use try catch block
                }
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
