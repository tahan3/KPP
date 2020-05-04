package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MaGUI {
    JFrame window;
    ImageIcon img;
    JPanel panel, menuPanel;
    JLabel dogInfo;
    JLabel foodInfo,
           commandInfo,
            catInfo,
            catSleepStatus;
    JButton commandBtn,
            poodleBtn,
            shepherdBtn,
            terrierBtn,
            getCatBtn,
            walkWDogBtn,
            unsleepBtn,
            backBtn;
    JTextField commandName;
    MaGUI(Owner owner, Menu changePet){//Добавить
        
        window = new JFrame("dada");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        img = new ImageIcon("dada.jpg");
        window.setIconImage(img.getImage());

        panel = new JPanel();

        foodInfo = new JLabel("Amount of food: "+owner.dogFood.getFood());
        panel.add(foodInfo);
        dogInfo = new JLabel("Dog info: "+owner.dog.getInfo());
        panel.add(dogInfo);

        commandName = new JTextField();
        commandName.setBackground(Color.WHITE);
        commandName.setColumns(14);
        panel.add(commandName);

        commandBtn = new JButton("give command");
        commandBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String str;
                str=commandName.getText();
                if(owner.dog.getCommand()){
                    commandInfo.setText("Command "+str+" was executed");
                    owner.feed();
                    str=String.valueOf(owner.dogFood.getFood());
                    foodInfo.setText("Amount of food: "+str);
                }else{
                    commandInfo.setText("Command "+str+" was not executed");
                }
            }
        });
        panel.add(commandBtn);

        walkWDogBtn = new JButton("walk the dog");
        walkWDogBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String str;
                owner.walkDog();
                str=String.valueOf(owner.dogFood.getFood());
                foodInfo.setText("Amount of food: "+str);
            }
        });
        panel.add(walkWDogBtn);

        commandInfo = new JLabel("");
        panel.add(commandInfo);

        getCatBtn = new JButton("get a cat");
        panel.add(getCatBtn);
        getCatBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                owner.getCat();
                getCatBtn.setEnabled(false);
                catInfo.setText("Cat info: "+owner.cat.name+" "+owner.cat.age+" years. Cat is sleeping");
                owner.cat.sleep();
                unsleepBtn.setEnabled(true);
            }
        });

        catInfo = new JLabel("");
        panel.add(catInfo);

        unsleepBtn= new JButton("Unsleep cat");
        unsleepBtn.setEnabled(false);
        unsleepBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                catInfo.setText("Cat info: "+owner.cat.name+" "+owner.cat.age+" years. Cat is stay wake");
            }
        });
        panel.add(unsleepBtn);

        backBtn = new JButton("change pets");
        backBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                window.setVisible(false);
                changePet.menu.setVisible(true);
            }
        });
        panel.add(backBtn);

        window.getContentPane().add(panel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setSize(300,250);
        window.setResizable(false);
    }
}
