package Chapter6;

import Tool.Employee;

/**
 * @description:
 * @version: 1.0
 * @date: 20/7/19 23:08
 */
public class CloneTest
{
    public static void main(String[] args)
    {
        Employee original = new Employee("A", 1000);
        try
        {
            Employee copy = original.clone();
            copy.raiseSalary(10);
            System.out.println("original = " + original);
            System.out.println("copy = " + copy);
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
