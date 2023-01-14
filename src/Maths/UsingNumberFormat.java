package Maths;

import javax.swing.*;

public class UsingNumberFormat {
    public static void main(String[] args) {
        // formating a number out
        Double number = Double.parseDouble(JOptionPane.showInputDialog("Enter a double number"));
        System.out.printf("%1.2f",number );

    }
}
