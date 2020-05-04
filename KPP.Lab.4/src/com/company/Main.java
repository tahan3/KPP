package com.company;

/*class JThread extends Thread {

    JThread(String name) {
        super(name);
    }

    public void run() {

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try {
            int i;
            for( i=0;i<1000;i++){
                Thread.sleep(1);
            }
            System.out.println(i);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}*/

import javax.swing.*;

public class Main {



    public static void main(String[] args) {

        GUI mainWindow = new GUI();
        mainWindow.window.setVisible(true);

        //Brain zdarova = new Brain();
        //zdarova.findNumber("+1233-333i");
        //zdarova.findQuarter();
        //zdarova.findModule();
        //System.out.println(zdarova.findRoot(6,1));
        /*
        System.out.println("Main thread started...");
        JThread t = new JThread("");
        for (int i = 1; i < 5; i++) {
            t = new JThread("JThread " + i);
            t.start();
            try{
                t.join();
            }
            catch(InterruptedException e){
                System.out.println("Zdarova");
            }
        }

        System.out.println("Main thread finished...");*/
        //MainThread t = new MainThread("","31+55i");
        //t.run(5);
        //MyWindow w = new MyWindow("kakao","12345");
    }
}