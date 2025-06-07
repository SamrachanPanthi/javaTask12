class Employee {
    // Method to describe work
    public void work() {
        System.out.println("Employee is working.");
    }
    public double getSalary() {
        return 30000.0; 
    }
}
class HRManager extends Employee {
    public void work() {
        System.out.println("HR Manager is managing employee relations.");
    }
}
public class Abc{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        System.out.println("Employee Salary: $" + emp.getSalary());

        System.out.println();
        HRManager hr = new HRManager();
        hr.work(); 
        System.out.println("HR Manager Salary: $" + hr.getSalary()); 
    }
}