package Chapter6;

import Tool.Employee;

import java.util.*;

/**
 * @description: 实现Comparable接口来进行用户自定义类的排序
 * @version: 1.0
 * @date: 20/7/19 22:24
 */
public class EmployeeSortTest
{
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Harry", 3500);
        employees[1] = new Employee("Carl", 7500);
        employees[2] = new Employee("Tony", 3800);

        Arrays.sort(employees);

        for (Employee e : employees)
        {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
