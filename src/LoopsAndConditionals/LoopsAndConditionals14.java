package LoopsAndConditionals;

import javax.swing.*;
public class LoopsAndConditionals14 {
    //Guess a random number
    public static void main(String[] args) {

        int randomNumber = (int)(Math.random()*100);
        //System.out.println(randomNumber);
        int enteredNumber = 77;
        int attempts= 0;

        while (randomNumber!=enteredNumber){
            enteredNumber= Integer.parseInt(JOptionPane.showInputDialog("Guess the random number!"));
            attempts++;

            if(randomNumber>enteredNumber){
                System.out.println("The random number is greater than the one you've entered");
            }else if (randomNumber<enteredNumber){
                System.out.println("The random number is less than the one you've entered");
            }

        }

        System.out.println("Congrats! You've guess the random number in " + attempts +" attemps");

    }
}