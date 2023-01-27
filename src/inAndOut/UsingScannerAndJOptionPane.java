package inAndOut;

import javax.swing.*;
import java.util.Scanner;

public class UsingScannerAndJOptionPane {

    public static void main(String[] args) {

        //Scanner

        System.out.println("Enter some string to catch by the scanner method");
        Scanner scanner = new Scanner(System.in);
        String somestring = scanner.nextLine();
        System.out.println("showing some string: " + somestring);

        //JOptionPane

        somestring = JOptionPane.showInputDialog("Enter some string to catch by the JOptionPane");
        System.out.println("showing some string: " + somestring);

        //JOptionPane and integer datatype

        String age = JOptionPane.showInputDialog("Enter your age and I add it some years more...");
        int agecopy = Integer.parseInt(age) + 10;
        System.out.println("showing age: " + agecopy);




    }

}
