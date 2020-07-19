package Other;

/**
 * @description: 参数数量可变的方法
 * @author: Pcy
 * @date: 20/7/19 18:11
 */
public class Chapter5_5
{
    public static void main(String[] args)
    {
        double d1 = max(2, 4, 5);
        double d2 = max(10.3, 43.5, d1);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

    }

    public static double max(double... values)
    {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values)
            if (v > largest)
                largest = v;
        return largest;
    }
}

