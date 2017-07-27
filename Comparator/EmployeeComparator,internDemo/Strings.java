/**
 * Created by saifia on 7/22/2017.
 */
public class Strings {
    public static void main(String[] args) {
        String name3="Arshi";
        String name=new String("Arshi");
        String name1=name.intern();
        String name2="Arshi";
      //  name="Arshi";//now name points to pool instead of heap.thus "Arshi" obj in heap is open for GC
        System.out.println(name==name1);
        System.out.println(name==name2);
        System.out.println(name1==name2);
        System.out.println(name==name3);
    }
}
