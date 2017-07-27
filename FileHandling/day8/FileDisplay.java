import jdk.internal.util.xml.impl.Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by saifia on 7/27/2017.
 */
public class FileDisplay {
    public static void main(String[] args) throws IOException {
        InputStream fis = null;
        try{
            fis = new FileInputStream("C:/javatraining/Movie.txt");
            int b = fis.read();
            while(b!=-1){
                System.out.print((char)b);
                b=fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fis!=null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
