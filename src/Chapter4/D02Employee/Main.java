package Chapter4.D02Employee;

public class Main
{
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("A", 100);
        employees[1] = new Employee("B", 200);
        employees[2] = new Employee("C", 300);

        for (Employee e : employees)
            e.raiseSalary(5);

        for (Employee e : employees)
        {
            System.out.println("e.getName() = " + e.getName());
            System.out.println("e.getSalary() = " + e.getSalary());
        }


    }
}
