package loopsAndConditionals;

import javax.swing.*;

// checking if is an e-mail value. Usin lenght, charAt
public class LoopsAndConditionals16 {

    public static void main(String[] args) {
        int at = 0;
        boolean dot = false;

        String email = JOptionPane.showInputDialog("Please, enter your e-mail");
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)=='@'){
                at++;
            }
            if (email.charAt(i)=='.') {
                dot=true;
            }
        }
        if(at!=1 && dot==true){
            System.out.println("incorrect email");
        }else{
            System.out.println("email ok");
        }
    }
}
