package AssignmentSRP;

import AssignmentSRP.EmployeeService;
import AssignmentSRP.HR;
import AssignmentSRP.Manager;
import org.junit.Test;

/**
 * Created by saifia on 7/25/2017.
 */
public class TestEmployee {


    @Test
    public void testEmployee(){
        EmployeeService e1=new EmployeeService(5,"Shamu",578299,"628393","sr tech","Automobile");
        Manager.changeProject(e1);
        Manager.changeDesignation(e1);
        HR.calculateTDS(e1);
        HR.updatesalary(e1);
        HR.eligibleForPromotion(e1);


    }


}
