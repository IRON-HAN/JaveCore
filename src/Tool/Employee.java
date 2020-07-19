package Tool;

import java.util.*;

/**
 * @description: Employee
 * @version: 2.0: implements Comparable
 * @version: 3.0: implements Cloneable
 * @date: 20/7/19 22:15
 */

public class Employee implements Comparable<Employee>, Cloneable
{
    // 1. ctor:
    // Notes: always with "new" operator
    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
        id = 0;
    }

    public Employee(double salary)
    {
        // call Tool.Employee(String, double)
        this("Tool.Employee #" + nextID, salary);
    }

    public Employee()
    {
    }

    // 2. getter setter:
    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    // 3. other methods:
    public void raiseSalary(double percent)
    {
        double raise = salary * percent / 100;
        salary += raise;
    }

    public int getId()
    {
        return id;
    }

    public void setId()
    {
        this.id = nextID;
        ++nextID;
    }

    public static int getNextID()
    {
        return nextID;
    }

    // 单元测试
    public static void main(String[] args)
    {
        Employee employee = new Employee("A", 500);
        System.out.println("employee.getSalary() = " + employee.getSalary());
        System.out.println("employee.getName() = " + employee.getName());
    }

    // field
    private String name;

    private double salary;

    private int id;

    private static int nextID = 1;

    @Override
    public String toString()
    {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + ", id=" + id + '}';
    }

    public Employee clone() throws CloneNotSupportedException
    {
        return (Employee) super.clone();
    }

    @Override
    public int compareTo(Employee o)
    {
        return Double.compare(salary, o.salary);
    }
}
