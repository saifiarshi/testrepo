package AssignmentSRP;

import AssignmentSRP.EmployeeService;

/**
 * Created by saifia on 7/25/2017.
 */
public class HR {
    public static void calculateTDS(EmployeeService e){

        System.out.println(e.getSalary()*.15);
    }

    public static void eligibleForPromotion(EmployeeService e){
        System.out.println("Not eligible for promotion as designation not GM");
        if((e.getDesig()).equals("GM")){
            System.out.println("Employee is eligible for promotion");
        }
    }

    public static void updatesalary(EmployeeService e){
        double newSalary=e.getSalary()+10000;
        System.out.println(newSalary);
    }
}
