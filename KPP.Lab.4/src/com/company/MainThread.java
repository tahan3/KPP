package com.company;

public class MainThread extends Thread {

    String complexNumber;

    MainThread(String name, String number) {
        super(name);
        complexNumber=number;
    }

    public void run(int extent) {
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
        MyThread t;
        for(int i=0;i<extent;i++){
            t = new MyThread("Thread №"+(i+1),complexNumber,extent,i);
            t.start();
        }
    }
}
