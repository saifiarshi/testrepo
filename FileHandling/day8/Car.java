import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by saifia on 7/27/2017.
 */
public class Car {
    public static void main(String[] args) {
        Set<String> set = new HashSet <>();
        set.add("Suzuki");
        set.add("Maruti");
        set.add("BMW");
        set.add("Alto");

        FileWriter osw = null;
            try {
                FileWriter fileWriter = osw = new FileWriter("C:/javatraining/Car1.txt");
                for (String aSet : set) {
                    osw.write(aSet);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                if(osw!=null){
                    try {
                        osw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }


    }

}
