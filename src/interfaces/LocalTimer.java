package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class LocalTimer {
    public static void main(String[] args) {


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Date now = new Date();
                System.out.println("I give you the date every 2 seconds: " + now);
                Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer myTimer = new Timer(2000, listener);
        myTimer.start();
        JOptionPane.showMessageDialog(null, "Press to stop the timer service");
        System.exit(0);


    }


}


