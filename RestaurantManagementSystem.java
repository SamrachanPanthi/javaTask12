// Abstract class 
abstract class Employees {
    protected String name;

    public Employees(String name) {
        this.name = name;
    }

    // Abstract method 
    public abstract void work();
    public abstract double getSalary();
}
class Chef extends Employees {
    private double salary;

    public Chef(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    public void work() {
        System.out.println(name + " (Chef) is preparing meals in the kitchen.");
    }
    public double getSalary() {
        return salary;
    }
}
class Waiter extends Employees {
    private double salary;

    public Waiter(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    
    public void work() {
        System.out.println(name + " (Waiter) is serving food to customers.");
    }
    public double getSalary() {
        return salary;
    }
}

// Main class 
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Employees chef = new Chef("Ramesh", 50000);
        Employees waiter = new Waiter("Sita", 30000);
        chef.work();
        System.out.println("Salary: Rs. " + chef.getSalary());

        System.out.println();

        waiter.work();
        System.out.println("Salary: Rs. " + waiter.getSalary());
    }
}
