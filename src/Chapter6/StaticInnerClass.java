package Chapter6;

/**
 * @description:
 * @version: 1.0
 * @date: 20/7/19 23:52
 */
public class StaticInnerClass
{
    public static void main(String[] args)
    {
        double[] doubles = new double[20];

        for (int i = 0; i < doubles.length; i++)
        {
            doubles[i] = 100 * Math.random();
        }

        ArrayAlg.Pair pair = ArrayAlg.MinMax(doubles);

        System.out.println("min= " + pair.getFirst());
        System.out.println("max= " + pair.getSecond());
    }
}

class ArrayAlg
{
    public static class Pair
    {
        private double first;
        private double second;

        public Pair(double first, double second)
        {
            this.first = first;
            this.second = second;
        }

        public double getFirst()
        {
            return first;
        }

        public double getSecond()
        {
            return second;
        }
    }

    public static Pair MinMax(double[] values)
    {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (double v : values)
        {
            if (min > v)
                min = v;
            if (max < v)
                max = v;
        }
        return new Pair(min, max);
    }
}
