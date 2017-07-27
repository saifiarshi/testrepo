package AssignmentSRP;

import AssignmentSRP.EmployeeService;
import AssignmentSRP.HR;

/**
 * Created by saifia on 7/25/2017.
 */
public class Manager extends HR {
    public static void changeProject(EmployeeService e) {
        System.out.println("The new project is" + e.getNewproject());
    }


    public static void changeDesignation(EmployeeService e) {
        if (e.getSalary() > 80000) {
            String newdesig = "DGM";
            System.out.println("The new designation is " + newdesig);
        }
    }
}
