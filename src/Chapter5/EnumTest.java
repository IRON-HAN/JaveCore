package Chapter5;

import java.util.*;

/**
 * @description: 5-6枚举
 * @author: Pcy
 * @date: 20/7/19 18:18
 */
public class EnumTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size = " + size);
        System.out.println("size.getString() = " + size.getString());
    }
}

enum Size
{
    SMALL("S"), MEDIUM("M"), EXTRA_LARGE("XL"), Large("L");
    String string;

    public String getString()
    {
        return string;
    }

    private Size(String string)
    {
        this.string = string;
    }
}