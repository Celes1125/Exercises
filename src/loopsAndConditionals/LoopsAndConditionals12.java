package loopsAndConditionals;

import javax.swing.*;
import java.util.Scanner;

//Using Math.PI, Math.pow, System.out.printf, /n, Integer.parseInt, Double.parseInt

public class LoopsAndConditionals12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona la opción deseada: /n1) cuadrado /n2) rectángulo /n3) triángulo /n4)círculo");
        int figura = scanner.nextInt();

        switch (figura) {
            case 1 :
                double side = Double.parseDouble(JOptionPane.showInputDialog("Plese enter the lenght of the side"));
                System.out.println("the square area is: " + Math.pow(side, 2));
                break;
            case 2 :
                double base = Double.parseDouble(JOptionPane.showInputDialog("Plese enter base lenght"));
                double height = Double.parseDouble(JOptionPane.showInputDialog("Plese enter height"));
                System.out.println("The rectangle area is: " + (base * height));
                break;
            case 3:
                base = Double.parseDouble(JOptionPane.showInputDialog("Plese enter base lenght"));
                height = Double.parseDouble(JOptionPane.showInputDialog("Plese enter height"));
                System.out.println("The triangle area is: " + (base*height)/2);
                break;
            case 4:
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Plese enter the lenght of the radio"));
                System.out.println("The circle area is: ");
                System.out.printf("%1.2f", Math.PI*Math.pow(radio,2));
                break;
            default:
                System.out.println("Please, enter a valid option");

        }
    }
}
