package Chapter6;

import java.util.*;

/**
 * @description:
 * @version: 1.0
 * @date: 20/7/19 23:17
 */
public class LambdaTest
{
    public static void main(String[] args)
    {
        String[] strings = new String[]{"AAA", "A", "AA", "B"};
        System.out.println(Arrays.toString(strings));

        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        Arrays.sort(strings, (l, r) -> l.length() - r.length());
        System.out.println(Arrays.toString(strings));
    }
}
