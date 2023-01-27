package loopsAndConditionals;

import javax.swing.*;
//Using loops for guess and evaluate users & passwords
public class LoopsAndConditionals13 {
    public static void main(String[] args){

        String password = "123";
        String enteredPassword = "";
        while (password.equals(enteredPassword)==false){
            enteredPassword = JOptionPane.showInputDialog("Enter the password");
        if (password.equals(enteredPassword)==false){
            System.out.println("WRONG PASSWORD");
        }
        }

        System.out.println("OK PASSWORD");


    }
}
