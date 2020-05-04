package com.company;

public class MyThread extends Thread {
    Brain solution;
    int extent, k;

    MyThread(String name, String complexNumber,int count,int i) {
        super(name);
        solution = new Brain(complexNumber);
        extent=count;
        k=i;
    }
    MyThread(String name){
        super(name);
    }

    public void run() {
        new MyWindow(this.getName(),Double.toString(solution.findRoot(extent,k))+'i');
    }
}
