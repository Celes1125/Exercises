package arrays;

import javax.swing.*;

public class ArraysAndForLoopAndJOptionPanel {
    public static void main(String[] args){
        String [] fruits = new String[3];
        for (int i = 0; i < fruits.length; i++) {
            fruits[i]= JOptionPane.showInputDialog("Introduce fruit number " + (i+1));

        }

        for (String fruit:fruits) {
            System.out.println(fruit);
        }


    }
}
