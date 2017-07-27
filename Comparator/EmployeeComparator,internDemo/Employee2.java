/**
 * Created by saifia on 7/22/2017.
 */
public class Employee2 {
    @Override
    public String toString() {
        return "Employee2{" +
                 fname + '\'' +
                 lname + '\'' +
                 deptname + '\'' +
                 id +
                 location + '\'' +
                '}';
    }

    public Employee2(String fname, String lname, String deptname, int id, String location) {
        this.fname = fname;
        this.lname = lname;
        this.deptname = deptname;
        this.id = id;
        this.location = location;
    }

    public String getFname() {

        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String fname;
    private String lname;
    private String deptname;
    private int id;
    private String location;
}

