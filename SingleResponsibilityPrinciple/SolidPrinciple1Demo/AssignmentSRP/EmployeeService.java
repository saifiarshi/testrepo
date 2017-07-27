package AssignmentSRP;

/**
 * Created by saifia on 7/25/2017.
 */
public class EmployeeService extends Manager {
    private int empId;
   private String name;
    private double salary;
    private String phone;
   private String desig;

    public EmployeeService(int empId, String name, double salary, String phone, String desig, String newproject) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.phone = phone;
        this.desig = desig;
        this.newproject = newproject;
    }

    private String newproject;

    public String getNewproject() {
        return newproject;
    }

    public void setNewproject(String newproject) {
        this.newproject = newproject;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }


}
