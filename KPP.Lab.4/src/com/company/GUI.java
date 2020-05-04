package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI {
    JFrame window;
    JTextField extentField;
    JTextField complexNumberField;
    JLabel extentLabel;
    JLabel writeNumberHere;
    JButton calculateBtn;
    JPanel panel;
    MainThread thread;
    GUI(){
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        extentLabel=new JLabel("extent: ");
        panel.add(extentLabel);

        extentField=new JTextField();
        extentField.setBackground(Color.WHITE);
        extentField.setColumns(14);
        panel.add(extentField);

        writeNumberHere=new JLabel("complex number: ");
        panel.add(writeNumberHere);

        complexNumberField=new JTextField();
        complexNumberField.setBackground(Color.WHITE);
        complexNumberField.setColumns(14);
        panel.add(complexNumberField);

        calculateBtn=new JButton("calculate");
        calculateBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String number = complexNumberField.getText();
                String extent = extentField.getText();

                MyWindow.x=10;
                MyWindow.y=10;

                thread = new MainThread("",number);
                thread.run(Integer.parseInt(extent));
            }
        });
        panel.add(calculateBtn);

        window.getContentPane().add(panel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setSize(300,250);
        window.setResizable(false);
    }
}
