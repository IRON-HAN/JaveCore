package Chapter6;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * @description:
 * @version: 1.0
 * @date: 20/7/19 22:44
 */
public class TimerTest
{
    public static void main(String[] args)
    {
        ActionListener listener = new TimePrinter();

        // construct a timer that calls the listener
        // every 5s
        Timer timer = new Timer(5 * 1000, listener);
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }

    private static class TimePrinter implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String s = sdf.format(new Date());
            System.out.println("the time is " + s);
            Toolkit.getDefaultToolkit().beep();
        }
    }
}