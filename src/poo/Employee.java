package poo;

import java.util.Date;
import java.util.GregorianCalendar;



public class Employee {
    private String name;
    private double salary;
    private Date contractStartDate;
    private int year;
    private int month;
    private int day;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        this.contractStartDate = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void raiseSalary (double percentage) {
        double increment = salary*percentage/100;
        this.salary+=increment;

    }


    public static void main(String[] args) {
        /*
        Employee employee1 = new Employee("Celeste Colautti", 3400, 2023, 2, 5);
        Employee employee2 = new Employee("Guillermo Flores", 4300, 2023, 1, 30);
        Employee employee3 = new Employee("Antonio Flores", 2100, 2023, 9, 30);

        System.out.println(employee1.getContractStartDate());*/

        Employee[] MyEmployees = new Employee [3];
        MyEmployees [0] = new Employee("Celeste Colautti", 3400, 2023, 2, 5);
        MyEmployees [1] = new Employee("Guillermo Flores", 4300, 2023, 1, 30);
        MyEmployees [2] = new Employee("Antonio Flores", 2100, 2023, 9, 3);

        /*for (int i = 0; i < MyEmployees.length; i++) {
            MyEmployees[i].raiseSalary(5);

        }
        for (int i = 0; i < MyEmployees.length; i++) {
            System.out.println("Name: "+ MyEmployees[i].getName()
                               +" Salary: " + MyEmployees[i].getSalary());*/

        for (Employee employee : MyEmployees){
            employee.raiseSalary(5);

        }
        for (Employee employee : MyEmployees){
            System.out.println("Name: "+ employee.getName()
                            +" Salary: " + employee.getSalary()
            );

        }



    }
}