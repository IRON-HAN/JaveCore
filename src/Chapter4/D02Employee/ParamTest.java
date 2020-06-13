/*
 * 1. 方法可以改变对象参数的状态(从而可以改变实参中的成员变量)
 * 2. 方法不能让对象参数引用一个新的对象(即不能改变整个实参的指向)
 * */

package Chapter4.D02Employee;

public class ParamTest
{
    public static void main(String[] args)
    {
        // Test1: method cant modify numeric params
        System.out.print("testing numeric params\n");
        double percent = 10;
        System.out.println("before = " + percent);
        triple(percent);
        System.out.println("after = " + percent);

        // Test2: method can change the state of obj params
        System.out.print("\ntesting obj params:\n");
        Employee harry = new Employee("Harry", 500);
        System.out.println("before = " + harry.getSalary());
        triple(harry);
        System.out.println("after = " + harry.getSalary());

        // Test3: methods cant attach new obj to obj params
        System.out.print("\ntesting swap:\n");
        Employee a = new Employee("A", 200);
        Employee b = new Employee("B", 300);
        System.out.println("before = " + a.getName());
        System.out.println("before = " + b.getName());
        swap(a, b);
        System.out.println("after = " + a.getName());
        System.out.println("after = " + b.getName());


    }

    public static void triple(double x)
    {
        x *= 3;
        System.out.println("x = " + x);
    }

    public static void triple(Employee e)
    {
        e.raiseSalary(200);
        System.out.println("e.getSalary() = " + e.getSalary());
    }

    public static void swap(Employee l, Employee r)
    {
        Employee tmp = l;
        l = r;
        r = tmp;
        System.out.println("l.getName() = " + l.getName());
        System.out.println("r.getName() = " + r.getName());
    }


}
