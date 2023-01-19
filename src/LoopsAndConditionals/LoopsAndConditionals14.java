package LoopsAndConditionals;

import javax.swing.*;
import java.sql.SQLOutput;

public class LoopsAndConditionals14 {
    //Guess a random number
    public static void main(String[] args) {

        int randomNumber = (int)Math.random();
        int enteredNumber = 0;
        int attempts= 3;

        while (randomNumber!=enteredNumber){
            JOptionPane.showInputDialog("Guess the random number! You have " + attempts + "attemps");

            if(randomNumber>enteredNumber){
                System.out.println("The random number is greater than the one you've entered");
            }else if (randomNumber<enteredNumber){
                System.out.println("The random number is less than the one you've entered");
            }

        }
        System.out.println("Congrats! You've guess the random number");

    }
}
