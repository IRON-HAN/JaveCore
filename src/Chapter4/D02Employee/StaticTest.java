package Chapter4.D02Employee;

public class StaticTest
{
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("A", 100);
        employees[1] = new Employee("B", 200);
        employees[2] = new Employee("C", 300);

        for (Employee e : employees)
        {
            e.setId();
            System.out.println("name= " + e.getName() + ",id= " + e.getId() + ",salary= " + e.getSalary());
        }

        int n = Employee.getNextID();
        System.out.println("nextId is = " + n);
    }
}
