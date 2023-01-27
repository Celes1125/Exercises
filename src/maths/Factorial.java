package maths;

import javax.swing.*;

//calculating factorial
public class Factorial {
    public static void main(String[] args) {
        long result = 1L;
        int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
        for (int i = number; i > 0 ; i--) {
            result = result *i;

        }
        System.out.println("The factorial o the number is: " + result);

    }
}
