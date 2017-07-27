import java.util.Comparator;

/**
 * Created by saifia on 7/22/2017.
 */
public class employeeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee2 e1=(Employee2)o1;
        Employee2 e2=(Employee2)o2;
        int v=e1.getLocation().compareTo(e2.getLocation());

            if(v!=0){
            return v;
            }
            v=e1.getDeptname().compareTo(e2.getDeptname());
            if(v!=0){
                return v;
            }
            v=e1.getFname().compareTo(e2.getFname());
            if(v!=0){
                return  v;
            }
        v=e1.getLname().compareTo(e2.getLname());
        if(v!=0){
            return  v;
        }
        return e1.getId()-e2.getId();
    }
}
