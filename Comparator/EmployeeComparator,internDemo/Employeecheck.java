import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by saifia on 7/22/2017.
 */
public class Employeecheck {
    public static void main(String[] args) {
        Employeecheck employeetest = new Employeecheck();
        List <Employee2> employeeList = employeetest.createTestData();
        employeeComparator c=new employeeComparator();
        employeeList.sort(c);
        for(Employee2 i:employeeList){
            System.out.println(i);
        }

    }

    public static List <Employee2> createTestData() {
        Employee2 e1 = new Employee2("ramesh", "bajpai", "HR", 12, "Pune");
        Employee2 e2 = new Employee2("ram", "singh", "HR", 122, "Pune");
        Employee2 e3 = new Employee2("shyam", "pall", "HR", 412, "Hyderabad");
        Employee2 e4 = new Employee2("tom", "singh", "HR", 128, "Pune");
        Employee2 e5 = new Employee2("harinder", "sahu", "HR", 152, "Pune");
        Employee2 e6 = new Employee2("rakesh", "bhargav", "HR", 128, "Pune");
        Employee2 e7 = new Employee2("rash", "sankla", "HR", 121, "Pune");
        Employee2 e8 = new Employee2("sumesh", "singh", "HR", 172, "Hyderabad");
        Employee2 e9 = new Employee2("mahesh", "sih", "Finance", 120, "Pune");
        Employee2 e10 = new Employee2("harsh", "singh", "HR", 162, "Pune");
        Employee2 e11 = new Employee2("saransh", "kapoor", "finance", 129, "Hyderabad");
        Employee2 e12 = new Employee2("arshi", "singh", "HR", 134, "Pune");
        Employee2 e13 = new Employee2("ramesh", "singh", "Finance", 182, "Pune");
        Employee2 e14 = new Employee2("rahat", "rai", "Finance", 1982, "Pune");
        Employee2 e15 = new Employee2("ramesh", "singh", "RnD", 1582, "Pune");
        Employee2 e16 = new Employee2("esh", "singh", "RnD", 11282, "Pune");
        Employee2 e17 = new Employee2("amesh", "tamrakar", "RnD", 1802, "Pune");
        Employee2 e18 = new Employee2("ramesh", "saifi", "RnD", 1282, "Pune");
        Employee2 e19 = new Employee2("rah", "sin", "RnD", 1852, "Pune");
        Employee2 e20 = new Employee2("rameshwari", "Bhir", "RnD", 1820, "Pune");

        List <Employee2> employeeList = new ArrayList <>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);
        employeeList.add(e8);
        employeeList.add(e9);
        employeeList.add(e10);
        employeeList.add(e11);
        employeeList.add(e12);
        employeeList.add(e13);
        employeeList.add(e14);
        employeeList.add(e15);
        employeeList.add(e16);
        employeeList.add(e17);
        employeeList.add(e18);
        employeeList.add(e19);
        employeeList.add(e20);
        return employeeList;
    }
}
