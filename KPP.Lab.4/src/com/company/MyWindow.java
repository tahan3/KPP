package com.company;

import javax.swing.*;

public class MyWindow {

    JDialog dialogWindow = new JDialog();
    JLabel lbl = new JLabel("");
    JPanel panel = new JPanel();
    static int x=10,y=10;
    static boolean down=true;
    MyWindow(String title,String text) {
        if(down==true) {
            y += 50;
            if(y>=750){
                down=false;
                x+=150;
            }
        }else{
            y-=50;
            if(y<=10){
                down=true;
                x+=150;
            }
        }
        dialogWindow.setLocation(x,y);
        dialogWindow.setTitle(title);
        dialogWindow.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        lbl.setText(text);
        panel.add(lbl);
        dialogWindow.setContentPane(panel);
        dialogWindow.pack();
        dialogWindow.setVisible(true);
    }
}
