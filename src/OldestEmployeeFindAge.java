import java.util.Arrays;import java.util.Comparator;import java.util.List;class Employee {    private int empId;    private String empName;    private int empAge;    private Department dept;    private int empSalary;    public Employee() {    }    public Employee(String empName, int empAge, int empId, Department dept, int empSalary) {        this.empName = empName;        this.empAge = empAge;        this.empId = empId;        this.dept = dept;        this.empSalary = empSalary;    }    public int getEmpId() {        return empId;    }    public void setEmpId(int empId) {        this.empId = empId;    }    public String empName() {        return empName;    }    public void setEmpName(String empName) {        this.empName = empName;    }    public int getEmpAge() {        return empAge;    }    public void setEmpAge(int empAge) {        this.empAge = empAge;    }    public Department getDept() {        return dept;    }    public void setDept(Department dept) {        this.dept = dept;    }    public int getEmpSalary() {        return empSalary;    }    public void setEmpSalary(int empSalary) {        this.empSalary = empSalary;    }    @Override    public String toString() {        return "Employee{" +                "empId=" + empId +                ", empString='" + empName + '\'' +                ", empAge=" + empAge +                ", dept=" + dept +                ", empSalary=" + empSalary +                '}';    }}class Department {    private String deptName;    public Department() {    }    public Department(String deptName) {        this.deptName = deptName;    }    public String getDeptName() {        return deptName;    }    public void setDeptName(String deptName) {        this.deptName = deptName;    }    @Override    public String toString() {        return " Department -" +                "Department Name : '" + deptName + '\'';    }}public class OldestEmployeeFindAge {    public static void main(String[] args) {        List<Employee> emp = Arrays.asList(                new Employee("Ram",23,101,new Department("IT"),50000),                new Employee("Om",78,102,new Department("Finances"),68000),                new Employee("Jay",29,103,new Department("HR"),98000)        );      Employee oldestEmployee = emp.stream().max(Comparator.comparingInt(Employee::getEmpAge)).get();      System.out.println(oldestEmployee);    }}