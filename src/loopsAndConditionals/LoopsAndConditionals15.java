package loopsAndConditionals;

import javax.swing.*;

//guess the ideal weight
public class LoopsAndConditionals15 {
    public static void main(String[] args){
        String gender = "";
        do {
            gender = JOptionPane.showInputDialog("Please, enter your gender: M/F");
        }while(gender.equalsIgnoreCase("F")==false && gender.equalsIgnoreCase("M")== false);

        int height = Integer.parseInt(JOptionPane.showInputDialog("Please, enter your height in cm"));
        int idealWeight = 0;
        if (gender.equalsIgnoreCase("H")){
                idealWeight= height-110;
        } else if (gender.equalsIgnoreCase("F")) {
            idealWeight = height-120;
            }
        System.out.println("Your ideal weight is: " + idealWeight);
    }

}
