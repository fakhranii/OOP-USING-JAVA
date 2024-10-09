public class Employee {
    int emp_id;
    String emp_name;
    String depart;
    double salary;
    double bonus;
    boolean resedent;


    public void print_emp_data(){
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Department: " + depart);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Bonus: " + bonus);
        System.out.println("Employee Resident: " + resedent);
    }
}