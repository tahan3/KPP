package com.company;

import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu {

    JFrame menu;
    Owner menuOwner;
    JPanel menuPanel;
    JButton poodleBtn,
            terrierBtn,
            shepherdBtn;
    MaGUI nextWindow;

    Menu() {
        menu = new JFrame("Menu");
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setSize(160,180);

        menuPanel = new JPanel();
        menuPanel.setBackground(Color.BLACK);

        poodleBtn = new JButton("Poodle");
        poodleBtn.setBackground(Color.WHITE);
        poodleBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuOwner = new Owner("Poodle");
                menu.setVisible(false);
                nextWindow = new MaGUI(menuOwner);
                nextWindow.window.setVisible(true);
            }
        });
        menuPanel.add(poodleBtn);

        terrierBtn = new JButton("Terrier");
        terrierBtn.setBackground(Color.RED);
        terrierBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuOwner = new Owner("Terrier");
                menu.setVisible(false);
                nextWindow = new MaGUI(menuOwner);
                nextWindow.window.setVisible(true);
            }
        });
        menuPanel.add(terrierBtn);

        shepherdBtn = new JButton("Shepherd Dog");
        shepherdBtn.setBackground(Color.WHITE);
        shepherdBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuOwner = new Owner("Shepherd Dog");
                menu.setVisible(false);
                nextWindow = new MaGUI(menuOwner);
                nextWindow.window.setVisible(true);
            }
        });
        menuPanel.add(shepherdBtn);

        menu.getContentPane().add(menuPanel);
        //menu.pack();
        menu.setLocationRelativeTo(null);
    }
}
